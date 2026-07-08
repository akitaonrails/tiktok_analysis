package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ActionModeCallbackC21510319Gb implements ActionMode.Callback {
    public final ActionMode.Callback LL;
    public final TextView LLILLJJLI;
    public Class<?> LLILLL;
    public Method LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.LL.onDestroyActionMode(actionMode);
    }

    public ActionModeCallbackC21510319Gb(ActionMode.Callback callback, TextView textView) {
        this.LL = callback;
        this.LLILLJJLI = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.LL.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.LL.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z;
        String str;
        Context context = this.LLILLJJLI.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.LLILZLL) {
            this.LLILZLL = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.LLILLL = cls;
                this.LLILZ = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.LLILZIL = true;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = false;
            }
        }
        try {
            if (this.LLILZIL && this.LLILLL.isInstance(menu)) {
                declaredMethod = this.LLILZ;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : C2204961BRm.LJJJJZ(packageManager, new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0, new C0WZX("dTF6Tg0zW9KSVlgzQFyTbyKexxGTvZT7X3xo6pZlP9Moi84=", new String[]{"01789"}))) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (!activityInfo.exported || ((str = activityInfo.permission) != null && context.checkSelfPermission(str) != 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) ListProtector.get(arrayList, i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.LLILLJJLI;
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                Intent intentPutExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return this.LL.onPrepareActionMode(actionMode, menu);
    }
}

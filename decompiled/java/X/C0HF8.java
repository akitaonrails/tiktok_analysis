package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HF8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HF8 extends AbstractC21673619ry<C0HF9> {
    public String LL = null;
    public final boolean LLILLJJLI = false;
    public final C19EG LLILLL;
    public C1037220d68 LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return 1;
    }

    public C0HF8(Fragment fragment) {
        this.LLILLL = fragment.getActivity();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1037220d68 c1037220d68;
        int iLIZJ = ((C14KQ.LIZJ(this.LLILLL) - C497820Jfg.LIZJ(this.LLILLL)) - ((int) this.LLILLL.getResources().getDimension(R.dimen.b3i))) - C341940Daq.LIZ(40.0d);
        if (this.LLILLJJLI) {
            iLIZJ -= (int) this.LLILLL.getResources().getDimension(R.dimen.a3q);
        }
        C786410Ut5.W5(viewHolder.itemView, new ViewGroup.LayoutParams(C14KQ.LJIIIIZZ(this.LLILLL), iLIZJ));
        String str = this.LL;
        if (str != null) {
            View view = viewHolder.itemView;
            if ((view instanceof C1037220d68) && (c1037220d68 = (C1037220d68) view) != null) {
                Uri uri = UriProtector.parse(str);
                if (!Intrinsics.LJFF(c1037220d68.LLILZLL, uri.toString())) {
                    c1037220d68.LLILZLL = uri.toString();
                    c1037220d68.LIZ(uri, null, null);
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.LLILZ = new C1037220d68(this.LLILLL, null, 6);
        Bundle bundle = new Bundle();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        C786410Ut5.LJJJI("url", str, bundle);
        final C1037220d68 c1037220d68 = this.LLILZ;
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c1037220d68) { // from class: X.0HF9
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0HF9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0HF9.class.getName();
        return viewHolder;
    }
}

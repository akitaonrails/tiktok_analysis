package X;

import Y.ACListenerS127S0200000_25;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.absetting.EffectPanelImageLoadOptConfig;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import mf.a;

/* JADX INFO: renamed from: X.0sj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637980sj6 extends AbstractC21673619ry<C1637990sj7> {
    public ComposerNode LL;
    public List<? extends ComposerNode> LLILLJJLI;
    public final /* synthetic */ C1638000sj8 LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List listLLLFZ;
        ComposerNode composerNode = this.LL;
        if (composerNode == null || (listLLLFZ = LLLFZ(composerNode)) == null) {
            return 0;
        }
        return listLLLFZ.size();
    }

    public C1637980sj6(C1638000sj8 c1638000sj8) {
        this.LLILLL = c1638000sj8;
    }

    public static List LLLFZ(ComposerNode composerNode) {
        if (composerNode.children == null) {
            return Collections.singletonList(composerNode);
        }
        ArrayList arrayList = new ArrayList();
        List<ComposerNode> list = composerNode.children;
        if (list != null) {
            Iterator it2 = ((ArrayList) C13LP.LJJJJLI(list)).iterator();
            while (it2.hasNext()) {
                it2.next();
                arrayList.addAll(LLLFZ(composerNode));
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ComposerNode composerNode;
        List<String> urlList;
        String str;
        int width;
        C1637990sj7 c1637990sj7 = (C1637990sj7) viewHolder;
        List<? extends ComposerNode> list = this.LLILLJJLI;
        Bitmap.Config config = null;
        if (list != null) {
            composerNode = (ComposerNode) ListProtector.get(list, i);
        } else {
            composerNode = null;
        }
        Function1<ComposerNode, Unit> function1 = this.LLILLL.LJ;
        c1637990sj7.LL.setText(composerNode.UI_name);
        c1637990sj7.LL.setShowDownloadIcon(true);
        C1662850tND c1662850tND = c1637990sj7.LL;
        UrlModel iconUrl = composerNode.effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ListProtector.get(urlList, 0)) != null && str.length() != 0) {
            C1637450siF.LIZ.getClass();
            boolean z = ((EffectPanelImageLoadOptConfig) C1637450siF.LIZJ.getValue()).enable;
            C1324800kZy imageView = c1662850tND.getImageView();
            int height = -1;
            if (z) {
                width = c1662850tND.getImageView().getWidth();
                height = c1662850tND.getImageView().getHeight();
                config = Bitmap.Config.RGB_565;
            } else {
                width = -1;
            }
            C1324750kZt.LJIIJ(imageView, str, width, height, config);
        }
        String id = composerNode.effect.getId();
        if (id != null && id.length() != 0 && !c1637990sj7.LLILLJJLI.LIZ.getStickerRepository().LJI().LIZ(composerNode.effect)) {
            c1637990sj7.LL.LJIJJ();
        } else {
            c1637990sj7.LL.LJIJ();
        }
        C1662850tND c1662850tND2 = c1637990sj7.LL;
        View.OnClickListener aCListenerS127S0200000_25 = new ACListenerS127S0200000_25(function1, composerNode, 9);
        if (C1848410yCV.LIZ) {
            aCListenerS127S0200000_25 = new f(aCListenerS127S0200000_25);
        }
        a aVar = new a(aCListenerS127S0200000_25);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1662850tND2);
        }
        c1662850tND2.setOnClickListener(aVar);
        c1637990sj7.LL.setCustomSelected(c1637990sj7.LLILLJJLI.LIZJ.getValue().contains(composerNode));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Pair pairLIZ = C1641100so8.LIZ(this.LLILLL.LIZLLL, viewGroup.getContext(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, AFwS266S0000000_25.get$arr$(600), 254);
        C1637990sj7 c1637990sj7 = new C1637990sj7(this.LLILLL, (View) pairLIZ.getFirst(), (C1662850tND) pairLIZ.getSecond());
        try {
            View view = c1637990sj7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1637990sj7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1637990sj7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1637990sj7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1637990sj7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1637990sj7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1637990sj7.class.getName();
        return c1637990sj7;
    }
}

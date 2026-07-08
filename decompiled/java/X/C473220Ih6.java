package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ih6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473220Ih6 extends AbstractC21673619ry<C473230Ih7> {
    public static String LLILZ;
    public final List<String> LL = new ArrayList();
    public final IHostCreativeTool LLILLJJLI = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);
    public LiveEffect LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final int LLLFZ(String str) {
        if (!Intrinsics.LJFF(LLILZ, str)) {
            int iIndexOf = ((ArrayList) this.LL).indexOf(LLILZ);
            LLILZ = str;
            if (iIndexOf >= 0) {
                notifyItemChanged(iIndexOf);
            }
            int iIndexOf2 = ((ArrayList) this.LL).indexOf(LLILZ);
            if (iIndexOf2 >= 0) {
                notifyItemChanged(iIndexOf2);
            }
            return iIndexOf2;
        }
        return ((ArrayList) this.LL).indexOf(LLILZ);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C473230Ih7 c473230Ih7 = (C473230Ih7) viewHolder;
        final String str = (String) ListProtector.get(this.LL, i);
        C1819620xS4.LIZ().setUrl(str).LJJI(c473230Ih7.LLILLJJLI);
        if (Intrinsics.LJFF(LLILZ, str)) {
            C500260Jjc.LLFFF(c473230Ih7.LL);
        } else {
            C500260Jjc.LJIILIIL(c473230Ih7.LL);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0UBU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String imgK;
                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
                LiveEffect.PlDataBean plDataBean;
                if (!Intrinsics.LJFF(C473220Ih6.LLILZ, str)) {
                    int iIndexOf = ((ArrayList) this.LL).indexOf(C473220Ih6.LLILZ);
                    C473220Ih6.LLILZ = str;
                    this.notifyItemChanged(iIndexOf);
                    this.notifyItemChanged(i);
                }
                C473220Ih6 c473220Ih6 = this;
                IHostCreativeTool iHostCreativeTool = c473220Ih6.LLILLJJLI;
                LiveEffect liveEffect = c473220Ih6.LLILLL;
                if (liveEffect == null || (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) == null || (plDataBean = stickerSDKExtraLJLJLLL.pl) == null || (imgK = plDataBean.getImgK()) == null) {
                    imgK = "";
                }
                iHostCreativeTool.resizePhoto(imgK, str);
                C0UCT c0uctLIZLLL = C0UF5.LIZLLL();
                if (c0uctLIZLLL != null) {
                    c0uctLIZLLL.LIZ = str;
                }
            }
        }, c473230Ih7.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C473230Ih7 c473230Ih7 = new C473230Ih7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gm7, viewGroup, false));
        try {
            View view = c473230Ih7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c473230Ih7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c473230Ih7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C473230Ih7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c473230Ih7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c473230Ih7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C473230Ih7.class.getName();
        return c473230Ih7;
    }
}

package X;

import Y.ACListenerS24S0301000_25;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ssE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643640ssE extends AbstractC2172971A2l<AIPlaygroundChipsModel, C1643650ssF> {
    public final InterfaceC1631620sYq<AIPlaygroundChipsModel, Integer, Boolean, Unit> LLILLJJLI;
    public int LLILLL;

    public C1643640ssE(C21285718Rr c21285718Rr) {
        super(new AbstractC339510DSr<AIPlaygroundChipsModel>() { // from class: X.0ssG
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(AIPlaygroundChipsModel aIPlaygroundChipsModel, AIPlaygroundChipsModel aIPlaygroundChipsModel2) {
                return Intrinsics.LJFF(aIPlaygroundChipsModel.id, aIPlaygroundChipsModel2.id);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(AIPlaygroundChipsModel aIPlaygroundChipsModel, AIPlaygroundChipsModel aIPlaygroundChipsModel2) {
                AIPlaygroundChipsModel aIPlaygroundChipsModel3 = aIPlaygroundChipsModel;
                AIPlaygroundChipsModel aIPlaygroundChipsModel4 = aIPlaygroundChipsModel2;
                if (Intrinsics.LJFF(aIPlaygroundChipsModel3.id, aIPlaygroundChipsModel4.id) && Intrinsics.LJFF(aIPlaygroundChipsModel3.panel, aIPlaygroundChipsModel4.panel)) {
                    return true;
                }
                return false;
            }
        });
        this.LLILLJJLI = c21285718Rr;
        this.LLILLL = -1;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIIIIL, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C1643650ssF c1643650ssF, int i) {
        C1325710kbR[] c1325710kbRArrLIZIZ;
        AIPlaygroundChipsModel aIPlaygroundChipsModelLLLFZ = LLLFZ(i);
        c1643650ssF.LLILLJJLI.setText(aIPlaygroundChipsModelLLLFZ.title);
        C1324800kZy c1324800kZy = c1643650ssF.LL;
        String str = aIPlaygroundChipsModelLLLFZ.coverPath;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        c1324800kZy.getClass();
        if (!TextUtils.isEmpty(str)) {
            c1325710kbRArrLIZIZ = C1324780kZw.LIZIZ(config, str);
        } else {
            c1325710kbRArrLIZIZ = null;
        }
        boolean z = true;
        C1324780kZw.LIZ(c1324800kZy, c1325710kbRArrLIZIZ, null, true, null);
        if (i != this.LLILLL) {
            z = false;
        }
        c1643650ssF.itemView.setSelected(z);
        C786410Ut5.I7(new ACListenerS24S0301000_25(this, c1643650ssF, aIPlaygroundChipsModelLLLFZ, i, 1), c1643650ssF.itemView);
        c1643650ssF.itemView.setContentDescription(aIPlaygroundChipsModelLLLFZ.title);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1643650ssF c1643650ssF = new C1643650ssF(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.mt, viewGroup, false));
        try {
            View view = c1643650ssF.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1643650ssF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1643650ssF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1643650ssF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1643650ssF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1643650ssF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1643650ssF.class.getName();
        return c1643650ssF;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1643650ssF c1643650ssF = (C1643650ssF) viewHolder;
        boolean z = true;
        if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), "sel")) {
            View view = c1643650ssF.itemView;
            if (i != this.LLILLL) {
                z = false;
            }
            view.setSelected(z);
            return;
        }
        onBindViewHolder(c1643650ssF, i);
    }
}

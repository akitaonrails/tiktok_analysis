package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoCardDTO;
import com.zhiliaoapp.musically.R;
import g1c.AjS3S0301000_26;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758880vs6 extends AbstractC2172971A2l<SeaPdpCreatorVideoCardDTO, C1758920vsA> {
    public static Integer LLILLL;
    public final InterfaceC1685420txc<Context, SeaPdpCreatorVideoCardDTO, View, Integer, String, Unit> LLILLJJLI;

    public C1758880vs6(C1776200wK2 c1776200wK2) {
        super(new AbstractC339510DSr<SeaPdpCreatorVideoCardDTO>() { // from class: X.0vs8
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO, SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO2) {
                return Intrinsics.LJFF(seaPdpCreatorVideoCardDTO, seaPdpCreatorVideoCardDTO2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO, SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO2) {
                return Intrinsics.LJFF(seaPdpCreatorVideoCardDTO.vid, seaPdpCreatorVideoCardDTO2.vid);
            }
        });
        this.LLILLJJLI = c1776200wK2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1758870vs5 c1758870vs5;
        C1758920vsA c1758920vsA = (C1758920vsA) viewHolder;
        SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTOLLLFZ = LLLFZ(i);
        View view = c1758920vsA.itemView;
        if ((view instanceof C1758870vs5) && (c1758870vs5 = (C1758870vs5) view) != null) {
            c1758870vs5.LIZ(seaPdpCreatorVideoCardDTOLLLFZ);
        }
        C786410Ut5.I7(new AjS3S0301000_26(this, c1758920vsA, seaPdpCreatorVideoCardDTOLLLFZ, i, 0), c1758920vsA.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C1758870vs5 c1758870vs5 = new C1758870vs5(viewGroup.getContext(), null, 6);
        c1758870vs5.LIZJ(C1758910vs9.LIZ(viewGroup.getContext()));
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c1758870vs5) { // from class: X.0vsA
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
                    stringBuffer.append(C1758920vsA.class.getName());
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
        C20612085q.LIZ = C1758920vsA.class.getName();
        return viewHolder;
    }
}

package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465750IOf extends AbstractC21673619ry<C465760IOg> {
    public final InterfaceC1631620sYq<LinkPlayerInfo, Integer, Integer, Unit> LL;
    public final List<LinkPlayerInfo> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C465750IOf(InterfaceC1631620sYq<? super LinkPlayerInfo, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq) {
        this.LL = interfaceC1631620sYq;
    }

    public final void LLLFZ(int i) {
        Object objLJJJLZIJ;
        if (i == -1 || (objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLJJLI)) == null) {
            return;
        }
        this.LL.invoke((LinkPlayerInfo) objLJJJLZIJ, Integer.valueOf(i + 1), Integer.valueOf(((ArrayList) this.LLILLJJLI).size()));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        LLLFZ(viewHolder.getBindingAdapterPosition());
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        C465760IOg c465760IOg = (C465760IOg) viewHolder;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) ListProtector.get(this.LLILLJJLI, i);
        c465760IOg.LLILLL.setText(C0KVU.LIZ(linkPlayerInfo.mUser));
        if (linkPlayerInfo.onlineStatus == 1) {
            C786410Ut5.LJLLLLLL(0, c465760IOg.LLILLJJLI);
        } else {
            C786410Ut5.LJLLLLLL(8, c465760IOg.LLILLJJLI);
        }
        C1099610eil c1099610eil = c465760IOg.LL;
        ImageModel avatarThumb = linkPlayerInfo.mUser.getAvatarThumb();
        Integer numValueOf = Integer.valueOf(c465760IOg.LL.getWidth());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iLIZIZ = numValueOf.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        Integer numValueOf2 = Integer.valueOf(c465760IOg.LL.getHeight());
        if (numValueOf2.intValue() > 0) {
            iLIZIZ2 = numValueOf2.intValue();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        C1121670fIL.LJIILIIL(c1099610eil, avatarThumb, iLIZIZ, iLIZIZ2, R.drawable.el_);
        C786410Ut5.I7(new ACListenerS142S0100000_7(linkPlayerInfo, 2), c465760IOg.itemView);
        if (c465760IOg.itemView.isAttachedToWindow()) {
            LLLFZ(i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C465760IOg c465760IOg = new C465760IOg(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hed, viewGroup, false));
        try {
            View view = c465760IOg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c465760IOg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c465760IOg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C465760IOg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c465760IOg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c465760IOg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C465760IOg.class.getName();
        return c465760IOg;
    }
}

package X;

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
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465770IOh extends AbstractC21673619ry<C465780IOi> {
    public final Function1<LinkPlayerInfo, Unit> LL;
    public final List<LinkPlayerInfo> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C465770IOh(C919110a1d c919110a1d) {
        this.LL = c919110a1d;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Object objLJJJLZIJ;
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (objLJJJLZIJ = C13LP.LJJJLZIJ(bindingAdapterPosition, this.LLILLJJLI)) != null) {
            this.LL.invoke((LinkPlayerInfo) objLJJJLZIJ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        Object objLJJJLZIJ;
        C465780IOi c465780IOi = (C465780IOi) viewHolder;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) ListProtector.get(this.LLILLJJLI, i);
        c465780IOi.LLILLL.setText(C0KVU.LIZ(linkPlayerInfo.mUser));
        View view = c465780IOi.LLILLJJLI;
        if (linkPlayerInfo.onlineStatus == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        C1099610eil c1099610eil = c465780IOi.LL;
        ImageModel avatarThumb = linkPlayerInfo.mUser.getAvatarThumb();
        Integer numValueOf = Integer.valueOf(c465780IOi.LL.getWidth());
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
        Integer numValueOf2 = Integer.valueOf(c465780IOi.LL.getHeight());
        if (numValueOf2.intValue() > 0) {
            iLIZIZ2 = numValueOf2.intValue();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        C1121670fIL.LJIILIIL(c1099610eil, avatarThumb, iLIZIZ, iLIZIZ2, R.drawable.el_);
        if (c465780IOi.itemView.isAttachedToWindow() && i != -1 && (objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLJJLI)) != null) {
            this.LL.invoke((LinkPlayerInfo) objLJJJLZIJ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C465780IOi c465780IOi = new C465780IOi(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hed, viewGroup, false));
        try {
            View view = c465780IOi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c465780IOi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c465780IOi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C465780IOi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c465780IOi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c465780IOi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C465780IOi.class.getName();
        return c465780IOi;
    }
}

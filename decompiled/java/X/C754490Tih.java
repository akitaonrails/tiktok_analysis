package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Tih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754490Tih extends AbstractC21673619ry<C754500Tii> {
    public List<GiftPickWithScore> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C754490Tih(List<GiftPickWithScore> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        String str;
        C754500Tii c754500Tii = (C754500Tii) viewHolder;
        GiftPick giftPick = ((GiftPickWithScore) ListProtector.get(this.LL, i)).giftPick;
        if (giftPick != null && giftPick.isPriorityRequest) {
            z = true;
        } else {
            z = false;
        }
        C1324720kZq c1324720kZq = c754500Tii.LL;
        C16F5 c16f5 = c754500Tii.LLILLJJLI;
        GiftPickWithScore giftPickWithScore = (GiftPickWithScore) ListProtector.get(this.LL, i);
        GiftPick giftPick2 = giftPickWithScore.giftPick;
        ImageModel imageModel = null;
        if (giftPick2 != null) {
            str = giftPick2.customizedDesc;
        } else {
            str = null;
        }
        c16f5.setText(str);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        GiftPick giftPick3 = giftPickWithScore.giftPick;
        if (giftPick3 != null) {
            imageModel = giftPick3.giftIcon;
        }
        C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.em2;
        int iLIZIZ = (int) C497740JfY.LIZIZ(28.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(28.0f);
        c1324610kZfLJIIIZ.LJ = iLIZIZ;
        c1324610kZfLJIIIZ.LJFF = iLIZIZ2;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
        View view = c754500Tii.itemView;
        if (i == this.LL.size() - 1) {
            C500260Jjc.LJJLJ(0, view);
            C500260Jjc.LJIILIIL(c754500Tii.LLILLL);
        } else if (i == 0 && z && this.LL.size() > 1) {
            C500260Jjc.LJJLJ(C497740JfY.LJIIIZ(R.dimen.ap0), view);
            C500260Jjc.LLFFF(c754500Tii.LLILLL);
        } else {
            C500260Jjc.LJJLJ(C497740JfY.LJIIIZ(R.dimen.ap9), view);
            C500260Jjc.LJIILIIL(c754500Tii.LLILLL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C754500Tii c754500Tii = new C754500Tii(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hwr, viewGroup, false));
        try {
            View view = c754500Tii.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c754500Tii.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c754500Tii.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C754500Tii.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c754500Tii.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c754500Tii.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C754500Tii.class.getName();
        return c754500Tii;
    }
}

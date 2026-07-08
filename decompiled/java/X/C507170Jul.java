package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Jul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507170Jul extends AbstractC21673619ry<C507180Jum> {
    public final InterfaceC507230Jur LL;
    public final List<C507220Juq> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C507170Jul(C507160Juk c507160Juk, List list) {
        this.LL = c507160Juk;
        this.LLILLJJLI = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        SOVMaskInfo sOVMaskInfo;
        C507180Jum c507180Jum = (C507180Jum) viewHolder;
        C507220Juq c507220Juq = (C507220Juq) ListProtector.get(this.LLILLJJLI, i);
        View view = c507180Jum.itemView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) C497740JfY.LIZIZ(c507220Juq.LIZIZ);
                layoutParams.height = (int) C497740JfY.LIZIZ(c507220Juq.LIZJ);
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        c507180Jum.LLILZIL.setBackground(C507390Jv7.LIZ(C497740JfY.LIZIZ(8.0f), 0, C20736316Cj.LIZIZ(R.attr.ey9, c507180Jum.itemView.getContext()), (int) C497740JfY.LIZIZ(0.5f)));
        PrivilegePageVideoListSetting privilegePageVideoListSetting = PrivilegePageVideoListSetting.INSTANCE;
        if (privilegePageVideoListSetting.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21()) {
            c507180Jum.itemView.setClickable(true);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jup
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.LL.LIZ(i);
                }
            }, c507180Jum.itemView);
        }
        ImageModel imageModel = null;
        if (privilegePageVideoListSetting.isEnabled() && ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).l21()) {
            SOVBriefInfo sOVBriefInfo = c507220Juq.LIZ;
            ImageView imageView = c507180Jum.LL;
            View view2 = c507180Jum.LLILLJJLI;
            ImageView imageView2 = c507180Jum.LLILZ;
            TextView textView = c507180Jum.LLILLL;
            if (sOVBriefInfo != null) {
                SOVMaskInfo sOVMaskInfo2 = sOVBriefInfo.maskInfo;
                if (sOVMaskInfo2 != null && sOVMaskInfo2.type == 1) {
                    C1143680frq.LIZLLL(imageView, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
                    C786410Ut5.LJLLLLLL(0, view2);
                    C786410Ut5.LJLLLLLL(0, imageView2);
                    C786410Ut5.LJLLLLLL(8, textView);
                    return;
                }
                if (sOVBriefInfo.lockInfo == 1) {
                    C1819620xS4.LIZ().LJIIIZ(sOVBriefInfo.cover).LJJI(imageView);
                    C786410Ut5.LJLLLLLL(0, view2);
                    C786410Ut5.LJLLLLLL(0, imageView2);
                    C786410Ut5.LJLLLLLL(8, textView);
                    return;
                }
                if (sOVBriefInfo.lockInfo == 2) {
                    C1819620xS4.LIZ().LJIIIZ(sOVBriefInfo.cover).LJJI(imageView);
                    C786410Ut5.LJLLLLLL(8, view2);
                    C786410Ut5.LJLLLLLL(8, imageView2);
                    C786410Ut5.LJLLLLLL(0, textView);
                    return;
                }
                imageModel = sOVBriefInfo.cover;
            }
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(imageView);
            C786410Ut5.LJLLLLLL(8, view2);
            C786410Ut5.LJLLLLLL(8, imageView2);
            C786410Ut5.LJLLLLLL(8, textView);
            return;
        }
        SOVBriefInfo sOVBriefInfo2 = c507220Juq.LIZ;
        if (sOVBriefInfo2 != null && (sOVMaskInfo = sOVBriefInfo2.maskInfo) != null && sOVMaskInfo.type == 1) {
            C1143680frq.LIZLLL(c507180Jum.LL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_only_video_mask.png");
            C786410Ut5.LJLLLLLL(0, c507180Jum.LLILLJJLI);
            C786410Ut5.LJZI(0, c507180Jum.LLILZ);
            C786410Ut5.LLIL(c507180Jum.LLILLL, 8);
            return;
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        SOVBriefInfo sOVBriefInfo3 = c507220Juq.LIZ;
        if (sOVBriefInfo3 != null) {
            imageModel = sOVBriefInfo3.cover;
        }
        c0jbnLIZ.LJIIIZ(imageModel).LJJI(c507180Jum.LL);
        C786410Ut5.LJLLLLLL(8, c507180Jum.LLILLJJLI);
        C786410Ut5.LJZI(8, c507180Jum.LLILZ);
        c507180Jum.LLILLL.setBackground(C507390Jv7.LIZ((int) C497740JfY.LIZIZ(2.0f), C20736316Cj.LIZIZ(R.attr.exm, c507180Jum.itemView.getContext()), 0, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C507180Jum c507180Jum = new C507180Jum(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hnu, viewGroup, false));
        try {
            View view = c507180Jum.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c507180Jum.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c507180Jum.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C507180Jum.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c507180Jum.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c507180Jum.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C507180Jum.class.getName();
        return c507180Jum;
    }
}

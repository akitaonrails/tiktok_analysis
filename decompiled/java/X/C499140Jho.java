package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499140Jho extends AbstractC508030Jw9<C507690Jvb> {
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final RecyclerView LLILZ;
    public final C434950H3t LLILZIL;
    public SubscriptionPrivilegeDetailFragment LLILZLL;
    public final C499130Jhn LLIZ;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Jhn] */
    public C499140Jho(View view) {
        super(view);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_title);
        this.LLILLL = (C16F5) view.findViewById(R.id.zhr);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.bq4);
        this.LLILZIL = new C434950H3t();
        this.LLIZ = new AbstractC1585810rMx() { // from class: X.0Jhn
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
                if (i == 1 && (subscriptionPrivilegeDetailFragment = this.LL.LLILZLL) != null) {
                    subscriptionPrivilegeDetailFragment.hS(C507380Jv6.LIZ(2).LIZ, C2097608Jq.LJ());
                }
            }
        };
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        final Context context;
        Badge badge;
        List<SubLevel> arrayList;
        SubPackagePrivilege subPackagePrivilegeZS;
        C507580JvQ c507580JvQ = (C507580JvQ) interfaceC515600KJy;
        R5(c507580JvQ);
        GetSubPrivilegeDetailResponse.Data data = c507580JvQ.LLILZ;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c507580JvQ.LLILZIL;
        this.LLILZLL = subscriptionPrivilegeDetailFragment;
        if (subscriptionPrivilegeDetailFragment != null && (context = subscriptionPrivilegeDetailFragment.getContext()) != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LLILZLL;
            if (subscriptionPrivilegeDetailFragment2 != null && (subPackagePrivilegeZS = subscriptionPrivilegeDetailFragment2.zS()) != null) {
                badge = subPackagePrivilegeZS.badge;
                arrayList = subPackagePrivilegeZS.allLevels;
            } else {
                badge = data.badge;
                arrayList = data.allLevels;
            }
            if (badge != null && badge.badgeType == 0) {
                C16F5 c16f5 = this.LLILLJJLI;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJI(2131844468));
                }
                C16F5 c16f52 = this.LLILLL;
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJI(2131844466));
                }
            } else {
                C16F5 c16f53 = this.LLILLJJLI;
                if (c16f53 != null) {
                    c16f53.setText(C497740JfY.LJIJI(2131844467));
                }
                C16F5 c16f54 = this.LLILLL;
                if (c16f54 != null) {
                    c16f54.setText(C497740JfY.LJIJI(2131844465));
                }
            }
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: X.0JwN
                    {
                        setOrientation(0);
                    }

                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
                        int iAbs;
                        float width = getWidth() / 2.0f;
                        int childCount = getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = getChildAt(i2);
                            if (childAt != null && (childAt instanceof C508160JwM)) {
                                if (C497740JfY.LJJ()) {
                                    iAbs = Math.abs(getDecoratedRight(childAt) - getWidth());
                                } else {
                                    iAbs = Math.abs(getDecoratedLeft(childAt));
                                }
                                ((C508160JwM) childAt).setItemScale(Math.max(1.0f - ((iAbs / width) * 0.27999997f), 0.72f));
                            }
                        }
                        return super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
                    }
                });
            }
            RecyclerView recyclerView2 = this.LLILZ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.LLILZIL);
            }
            RecyclerView recyclerView3 = this.LLILZ;
            if (recyclerView3 != null) {
                recyclerView3.removeOnScrollListener(this.LLIZ);
            }
            RecyclerView recyclerView4 = this.LLILZ;
            if (recyclerView4 != null) {
                recyclerView4.addOnScrollListener(this.LLIZ);
            }
            C434950H3t c434950H3t = this.LLILZIL;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            ((ArrayList) c434950H3t.LL).clear();
            C19719612Di.LJJI(arrayList, c434950H3t.LL);
            c434950H3t.notifyDataSetChanged();
        }
    }
}

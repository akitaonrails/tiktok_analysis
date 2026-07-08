package X;

import Y.AsS34S0100000_7;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0O extends C0K1I<C510490K0h> {
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final RecyclerView LLILZ;
    public final C0H4E LLILZIL;
    public SubscriptionPrivilegeDetailFragment LLILZLL;
    public final AsS34S0100000_7 LLIZ;

    public C0K0O(View view) {
        super(view);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_title);
        this.LLILLL = (TextView) view.findViewById(R.id.zhr);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.bq4);
        this.LLILZIL = new C0H4E();
        this.LLIZ = new AsS34S0100000_7(this, 4);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        final Context context;
        Badge badge;
        List<SubLevel> arrayList;
        SubPackagePrivilege subPackagePrivilegeUS;
        C510480K0g c510480K0g = (C510480K0g) interfaceC339570DSx;
        P5(c510480K0g);
        PGCGetSubPrivilegeDetailResponse.Data data = c510480K0g.LIZLLL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510480K0g.LJ;
        this.LLILZLL = subscriptionPrivilegeDetailFragment;
        if (subscriptionPrivilegeDetailFragment != null && (context = subscriptionPrivilegeDetailFragment.getContext()) != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LLILZLL;
            if (subscriptionPrivilegeDetailFragment2 != null && (subPackagePrivilegeUS = subscriptionPrivilegeDetailFragment2.uS()) != null) {
                badge = subPackagePrivilegeUS.badge;
                arrayList = subPackagePrivilegeUS.allLevels;
            } else {
                badge = data.badge;
                arrayList = data.allLevels;
            }
            if (badge != null && badge.badgeType == 0) {
                TextView textView = this.LLILLJJLI;
                if (textView != null) {
                    textView.setText(C511520K4g.LJII(2131839729));
                }
                TextView textView2 = this.LLILLL;
                if (textView2 != null) {
                    textView2.setText(C511520K4g.LJII(2131839727));
                }
            } else {
                TextView textView3 = this.LLILLJJLI;
                if (textView3 != null) {
                    textView3.setText(C511520K4g.LJII(2131839728));
                }
                TextView textView4 = this.LLILLL;
                if (textView4 != null) {
                    textView4.setText(C511520K4g.LJII(2131839726));
                }
            }
            RecyclerView recyclerView = this.LLILZ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: X.0K0P
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
                            if (childAt != null && (childAt instanceof C0K1B)) {
                                if (C511520K4g.LJIIIZ()) {
                                    iAbs = Math.abs(getDecoratedRight(childAt) - getWidth());
                                } else {
                                    iAbs = Math.abs(getDecoratedLeft(childAt));
                                }
                                ((C0K1B) childAt).setItemScale(Math.max(1.0f - ((iAbs / width) * 0.27999997f), 0.72f));
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
            C0H4E c0h4e = this.LLILZIL;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            ((ArrayList) c0h4e.LL).clear();
            C19719612Di.LJJI(arrayList, c0h4e.LL);
            c0h4e.notifyDataSetChanged();
        }
    }
}

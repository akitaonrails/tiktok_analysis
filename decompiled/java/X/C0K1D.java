package X;

import Y.ACListenerS25S1300000_7;
import Y.ACListenerS73S0300000_6;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K1D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1D extends C0K1I<C0K0M> {
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public final TextView LLIZ;
    public final RecyclerView LLIZLLLIL;
    public final ViewGroup LLJ;
    public final TextView LLJI;
    public final ImageView LLJIJIL;
    public final ImageView LLJILJIL;

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        Context context;
        int iLJI;
        List<EmoteModel> emoteList;
        boolean z;
        String str;
        String strLJIIIIZZ;
        int i;
        String string;
        List<EmoteModel> list;
        EmoteListResult emoteListResult;
        List<EmoteModel> emoteList2;
        C510480K0g c510480K0g = (C510480K0g) interfaceC339570DSx;
        P5(c510480K0g);
        PGCGetSubPrivilegeDetailResponse.Data data = c510480K0g.LIZLLL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510480K0g.LJ;
        if (subscriptionPrivilegeDetailFragment != null && (context = subscriptionPrivilegeDetailFragment.getContext()) != null) {
            if (C0K2B.LIZ(context)) {
                iLJI = (int) C511520K4g.LIZ(375.0f);
            } else {
                iLJI = C511520K4g.LJI();
            }
            int iLIZ = (iLJI - ((int) C511520K4g.LIZ((this.LLILLL * (this.LLILZIL - 1)) + 32.0f))) / this.LLILZIL;
            C0K1F c0k1fLIZ = C0K1E.LIZ(subscriptionPrivilegeDetailFragment);
            long j = 0;
            if (c0k1fLIZ != null && c0k1fLIZ.LIZ == 0) {
                c0k1fLIZ.LIZ = System.currentTimeMillis();
            }
            C435220H4u c435220H4u = new C435220H4u(this, context, iLIZ, subscriptionPrivilegeDetailFragment);
            ArrayList arrayList = new ArrayList();
            if (subscriptionPrivilegeDetailFragment.uS() != null) {
                SubPackagePrivilege subPackagePrivilegeUS = subscriptionPrivilegeDetailFragment.uS();
                if (subPackagePrivilegeUS != null && (emoteListResult = subPackagePrivilegeUS.emoteDetail) != null && (emoteList2 = emoteListResult.getEmoteList()) != null) {
                    arrayList.addAll(emoteList2);
                }
            } else {
                EmoteListResult emoteListResult2 = data.emoteDetail;
                if (emoteListResult2 != null && (emoteList = emoteListResult2.getEmoteList()) != null) {
                    arrayList.addAll(emoteList);
                }
            }
            EmoteConfig emoteConfig = data.emoteConfig;
            if (emoteConfig != null && (list = emoteConfig.defaultEmoteList) != null) {
                arrayList.addAll(list);
            }
            List<EmoteModel> list2 = data.subWaveStrikeEmotes;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            RecyclerView recyclerView = this.LLIZLLLIL;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new GridLayoutManager(context, this.LLILZIL));
            }
            RecyclerView recyclerView2 = this.LLIZLLLIL;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c435220H4u);
            }
            RecyclerView recyclerView3 = this.LLIZLLLIL;
            if (recyclerView3 != null) {
                recyclerView3.setHasFixedSize(true);
            }
            RecyclerView recyclerView4 = this.LLIZLLLIL;
            if (recyclerView4 != null) {
                recyclerView4.setItemViewCacheSize(20);
            }
            final int i2 = this.LLILZIL;
            final int iLIZ2 = (int) C511520K4g.LIZ(this.LLILLL);
            final int iLIZ3 = (int) C511520K4g.LIZ(this.LLILLL);
            C0DXR c0dxr = new C0DXR(i2, iLIZ2, iLIZ3) { // from class: X.0DXl
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final boolean LLILZ = false;

                {
                    this.LL = i2;
                    this.LLILLJJLI = iLIZ2;
                    this.LLILLL = iLIZ3;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView5.getChildAdapterPosition(view);
                    if (childAdapterPosition == -1) {
                        return;
                    }
                    int i3 = this.LL;
                    int i4 = childAdapterPosition % i3;
                    if (this.LLILZ) {
                        int i5 = this.LLILLJJLI;
                        rect.left = i5 - ((i4 * i5) / i3);
                        rect.right = ((i4 + 1) * i5) / i3;
                        if (childAdapterPosition < i3) {
                            rect.top = this.LLILLL;
                        }
                        rect.bottom = this.LLILLL;
                        return;
                    }
                    int i6 = this.LLILLJJLI;
                    rect.left = (i4 * i6) / i3;
                    rect.right = i6 - (((i4 + 1) * i6) / i3);
                    if (childAdapterPosition < i3) {
                        return;
                    }
                    rect.top = this.LLILLL;
                }
            };
            RecyclerView recyclerView5 = this.LLIZLLLIL;
            if (recyclerView5 != null) {
                recyclerView5.addItemDecoration(c0dxr);
            }
            ((ArrayList) c435220H4u.LLILZLL).clear();
            C19719612Di.LJJI(arrayList, c435220H4u.LLILZLL);
            c435220H4u.notifyDataSetChanged();
            if (this.LLILLJJLI) {
                User user = c510480K0g.LIZLLL.anchorDetail;
                if (user == null || (string = C0K7S.LIZ(user)) == null) {
                    string = context.getResources().getString(2131826820);
                }
                String string2 = context.getResources().getString(2131839360, string);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(" (");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(')');
                this.LLIZ.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                if (arrayList.size() > this.LLILZIL) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLZ(i, viewGroup);
            }
            ACListenerS73S0300000_6 aCListenerS73S0300000_6 = new ACListenerS73S0300000_6(this, c435220H4u, context, 6);
            TextView textView = this.LLJI;
            if (textView != null) {
                if (this.LLILLJJLI) {
                    strLJIIIIZZ = context.getResources().getString(2131839359);
                } else {
                    strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839489, String.valueOf(arrayList.size()));
                }
                textView.setText(strLJIIIIZZ);
            }
            TextView textView2 = this.LLJI;
            if (textView2 != null) {
                C786410Ut5.T7(textView2, aCListenerS73S0300000_6);
            }
            ImageView imageView = this.LLJIJIL;
            if (imageView != null) {
                C786410Ut5.Q7(imageView, aCListenerS73S0300000_6);
            }
            if (data.suggestEmotesSwitch == 1 && Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLILLJJLI, Boolean.FALSE)) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView2 = this.LLJILJIL;
            if (imageView2 != null) {
                C0K0R.LIZIZ(imageView2, z);
                SubscriptionSceneContext subscriptionSceneContext = subscriptionPrivilegeDetailFragment.LLJJI;
                if (subscriptionSceneContext != null && subscriptionSceneContext.isSubscribed) {
                    str = "subscriber";
                } else {
                    str = "others";
                }
                ImageView imageView3 = this.LLJILJIL;
                if (imageView3 != null) {
                    C786410Ut5.Q7(imageView3, new ACListenerS25S1300000_7(subscriptionPrivilegeDetailFragment, data, context, str, 2));
                }
                if (!Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LLILLJJLI, Boolean.TRUE) && !this.LLILZLL) {
                    this.LLILZLL = true;
                    SubscriptionSceneContext subscriptionSceneContext2 = subscriptionPrivilegeDetailFragment.LLJJI;
                    if (subscriptionSceneContext2 != null) {
                        j = subscriptionSceneContext2.anchorUid;
                    }
                    C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_suggest_emotes_entrance_show");
                    c511970K5z.LIZIZ(Long.valueOf(j), "anchor_id");
                    c511970K5z.LIZIZ("privilege_page", "entrance_page");
                    c511970K5z.LIZIZ(str, "upload_user_type");
                    c511970K5z.LIZLLL();
                }
            }
        }
    }

    public C0K1D(View view, boolean z) {
        super(view);
        this.LLILLJJLI = z;
        this.LLILLL = 8.0f;
        this.LLILZIL = 5;
        this.LLIZ = (TextView) view.findViewById(R.id.tv_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.h1h);
        this.LLIZLLLIL = recyclerView;
        this.LLJ = (ViewGroup) view.findViewById(R.id.v_t);
        this.LLJI = (TextView) view.findViewById(R.id.v_s);
        this.LLJIJIL = (ImageView) view.findViewById(R.id.v_u);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.h1l);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
    }
}

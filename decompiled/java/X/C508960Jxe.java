package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508960Jxe extends AbstractC508030Jw9<C507710Jvd> {
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public boolean LLILZIL;
    public final C16F5 LLILZLL;
    public final RecyclerView LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final C16F5 LLJ;
    public final LiveIconView LLJI;
    public final LiveIconView LLJIJIL;
    public C340730DXj LLJILJIL;

    @Override // X.C0K07
    public final void N5() {
        RecyclerView recyclerView;
        C340730DXj c340730DXj = this.LLJILJIL;
        if (c340730DXj == null || (recyclerView = this.LLIZ) == null) {
            return;
        }
        recyclerView.removeItemDecoration(c340730DXj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0DXR, X.0DXj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        final Context context;
        int iLJIIZILJ;
        List<EmoteModel> emoteList;
        boolean z;
        final String str;
        User owner;
        String strLJIJJ;
        int i;
        String string;
        List<EmoteModel> list;
        EmoteListResult emoteListResult;
        List<EmoteModel> emoteList2;
        C507580JvQ c507580JvQ = (C507580JvQ) interfaceC515600KJy;
        R5(c507580JvQ);
        final GetSubPrivilegeDetailResponse.Data data = c507580JvQ.LLILZ;
        final SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c507580JvQ.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null && (context = subscriptionPrivilegeDetailFragment.getContext()) != null) {
            if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                iLJIIZILJ = (int) C497740JfY.LIZIZ(375.0f);
            } else {
                iLJIIZILJ = C497740JfY.LJIIZILJ();
            }
            int iLIZIZ = (iLJIIZILJ - ((int) C497740JfY.LIZIZ((this.LLILLL * (this.LLILZ - 1)) + 32.0f))) / this.LLILZ;
            EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModelLIZIZ = C508920Jxa.LIZIZ(subscriptionPrivilegeDetailFragment);
            long id = 0;
            if (emotePerformanceTrackerViewModelLIZIZ != null) {
                if (emotePerformanceTrackerViewModelLIZIZ.LLIZ != 0) {
                    emotePerformanceTrackerViewModelLIZIZ.LLIZLLLIL = System.currentTimeMillis();
                }
                emotePerformanceTrackerViewModelLIZIZ.init();
            }
            final C435230H4v c435230H4v = new C435230H4v(this, context, iLIZIZ, subscriptionPrivilegeDetailFragment);
            ArrayList arrayList = new ArrayList();
            if (subscriptionPrivilegeDetailFragment.zS() != null) {
                SubPackagePrivilege subPackagePrivilegeZS = subscriptionPrivilegeDetailFragment.zS();
                if (subPackagePrivilegeZS != null && (emoteListResult = subPackagePrivilegeZS.emoteDetail) != null && (emoteList2 = emoteListResult.getEmoteList()) != null) {
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
            RecyclerView recyclerView = this.LLIZ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new SSGridLayoutManager(context, this.LLILZ));
            }
            RecyclerView recyclerView2 = this.LLIZ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c435230H4v);
            }
            RecyclerView recyclerView3 = this.LLIZ;
            if (recyclerView3 != null) {
                recyclerView3.setHasFixedSize(true);
            }
            RecyclerView recyclerView4 = this.LLIZ;
            if (recyclerView4 != null) {
                recyclerView4.setItemViewCacheSize(20);
            }
            final int i2 = this.LLILZ;
            final int iLIZIZ2 = (int) C497740JfY.LIZIZ(this.LLILLL);
            final int iLIZIZ3 = (int) C497740JfY.LIZIZ(this.LLILLL);
            ?? r6 = new C0DXR(i2, iLIZIZ2, iLIZIZ3) { // from class: X.0DXj
                public final int LL;
                public final int LLILLJJLI;
                public final int LLILLL;
                public final boolean LLILZ = false;

                {
                    this.LL = i2;
                    this.LLILLJJLI = iLIZIZ2;
                    this.LLILLL = iLIZIZ3;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView5.getChildAdapterPosition(view);
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
            this.LLJILJIL = r6;
            RecyclerView recyclerView5 = this.LLIZ;
            if (recyclerView5 != 0) {
                recyclerView5.addItemDecoration(r6);
            }
            ((ArrayList) c435230H4v.LLILZLL).clear();
            C19719612Di.LJJI(arrayList, c435230H4v.LLILZLL);
            c435230H4v.notifyDataSetChanged();
            if (this.LLILLJJLI) {
                User user = c507580JvQ.LLILZ.anchorDetail;
                if (user == null || (string = C0KVU.LIZ(user)) == null) {
                    string = context.getResources().getString(2131826820);
                }
                String string2 = context.getResources().getString(2131839360, string);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(" (");
                sbLIZ.append(arrayList.size());
                sbLIZ.append(')');
                this.LLILZLL.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            ViewGroup viewGroup = this.LLIZLLLIL;
            if (viewGroup != null) {
                if (arrayList.size() > this.LLILZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLZ(i, viewGroup);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0H4w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C435230H4v c435230H4v2 = c435230H4v;
                    c435230H4v2.LLILLJJLI = false;
                    c435230H4v2.notifyDataSetChanged();
                    C500260Jjc.LJIILIIL(this.LLIZLLLIL);
                }
            };
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                if (this.LLILLJJLI) {
                    strLJIJJ = context.getResources().getString(2131839359);
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131856507, String.valueOf(arrayList.size()));
                }
                c16f5.setText(strLJIJJ);
            }
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                C786410Ut5.l8(c16f52, onClickListener);
            }
            LiveIconView liveIconView = this.LLJI;
            if (liveIconView != null) {
                C786410Ut5.g8(liveIconView, onClickListener);
            }
            if (data.suggestEmotesSwitch == 1 && Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LL, Boolean.FALSE)) {
                z = true;
            } else {
                z = false;
            }
            LiveIconView liveIconView2 = this.LLJIJIL;
            if (liveIconView2 != null) {
                C500260Jjc.LJLJLJ(liveIconView2, z);
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(subscriptionPrivilegeDetailFragment.LLJJ);
                if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null && owner.isSubscribed()) {
                    str = "subscriber";
                } else {
                    DataChannel dataChannel = subscriptionPrivilegeDetailFragment.LLJJ;
                    if (dataChannel != null && C01C5.LIZ(dataChannel)) {
                        str = "moderator";
                    } else {
                        str = "others";
                    }
                }
                LiveIconView liveIconView3 = this.LLJIJIL;
                if (liveIconView3 != null) {
                    C786410Ut5.g8(liveIconView3, new View.OnClickListener() { // from class: X.0Jaw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str2;
                            String secUid;
                            long id2;
                            C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_subscribe/sub_suggest_emote");
                            if (subscriptionPrivilegeDetailFragment.LLILLL == EnumC507490JvH.POPUP && DataChannelGlobal.LLILZ.gg0(C930940aKi.class) != null) {
                                str2 = "1";
                            } else {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c495520Jby.LIZJ("is_sheet", str2);
                            User user2 = data.anchorDetail;
                            if (user2 == null || (secUid = user2.getSecUid()) == null) {
                                secUid = "";
                            }
                            c495520Jby.LIZJ("sec_anchor_id", secUid);
                            User user3 = data.anchorDetail;
                            long id3 = 0;
                            if (user3 != null) {
                                id2 = user3.getId();
                            } else {
                                id2 = 0;
                            }
                            c495520Jby.LIZIZ(id2, "anchor_id");
                            c495520Jby.LIZJ("show_entrance", "sub_privilege_page");
                            c495520Jby.LIZJ("upload_user_type", str);
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_suggest_emotes_entrance_click");
                            User user4 = data.anchorDetail;
                            if (user4 != null) {
                                id3 = user4.getId();
                            }
                            c474500IjALIZ.LJJII(Long.valueOf(id3), "anchor_id");
                            c474500IjALIZ.LJJII("sub_privilege_page", "entrance_page");
                            c474500IjALIZ.LJJII(str, "upload_user_type");
                            c474500IjALIZ.LIZ();
                        }
                    });
                }
                if (!Intrinsics.LJFF(subscriptionPrivilegeDetailFragment.LL, Boolean.TRUE) && !this.LLILZIL) {
                    this.LLILZIL = true;
                    User userLJIIIIZZ = C500260Jjc.LJIIIIZZ(subscriptionPrivilegeDetailFragment.LLJJ);
                    if (userLJIIIIZZ != null) {
                        id = userLJIIIIZZ.getId();
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_suggest_emotes_entrance_show");
                    c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
                    c474500IjALIZ.LJJII("sub_privilege_page", "entrance_page");
                    c474500IjALIZ.LJJII(str, "upload_user_type");
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }

    public C508960Jxe(View view, boolean z) {
        super(view);
        this.LLILLJJLI = z;
        this.LLILLL = 8.0f;
        this.LLILZ = 5;
        this.LLILZLL = (C16F5) view.findViewById(R.id.tv_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.h1h);
        this.LLIZ = recyclerView;
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.v_t);
        this.LLJ = (C16F5) view.findViewById(R.id.v_s);
        this.LLJI = (LiveIconView) view.findViewById(R.id.v_u);
        this.LLJIJIL = (LiveIconView) view.findViewById(R.id.h1l);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
        }
    }
}

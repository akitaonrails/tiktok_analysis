package X;

import X.C1608510rxZ;
import X.InterfaceC662550Pyn;
import Y.ACListenerS114S0200000_10;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecom.data.ShopIcon;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$lifecycleCallback$1;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0PyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnClickListenerC662370PyV extends AbstractViewOnAttachStateChangeListenerC654600Ply implements View.OnClickListener, Observer<FollowStatus> {
    public static final /* synthetic */ int LLLLIIL = 0;
    public final Fragment LLIZ;
    public final C01GW LLIZLLLIL;
    public C1609500rzA LLJ;
    public View LLJI;
    public C1610670s13 LLJIJIL;
    public C1610770s1D LLJILJIL;
    public View LLJILJILJ;
    public C670070QQb LLJILLL;
    public TuxTextView LLJJ;
    public TuxIconView LLJJI;
    public TextView LLJJIII;
    public TuxTextView LLJJIJI;
    public C0QB7 LLJJIJIIJIL;
    public RelativeLayout LLJJIJIL;
    public ViewStub LLJJJ;
    public ViewStub LLJJJIL;
    public C653570PkJ LLJJJJ;
    public C663770Q1v LLJJJJJIL;
    public C0Q2G LLJJJJLIIL;
    public C1608510rxZ LLJJL;
    public InterfaceC662550Pyn LLJJLIIIJLLLLLLLZ;
    public User LLJL;
    public volatile SearchUser LLJLIL;
    public final InterfaceC653950Pkv LLJLILLLLZIIL;
    public InterfaceC662610Pyt LLJLL;
    public C662710Pz3 LLJLLIL;
    public SearchResultParam LLJLLL;
    public String LLJZ;
    public View LLJZIJLIL;
    public boolean LLL;
    public volatile boolean LLLF;
    public final C01GW LLLFF;
    public int LLLFFI;
    public User LLLFZ;
    public SearchUser LLLI;
    public EnumC662450Pyd LLLII;
    public final AObserverS214S0100000_10 LLLIIII;
    public final AObserverS214S0100000_10 LLLIIIIL;
    public final AObserverS214S0100000_10 LLLIIIL;
    public boolean LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final AwS554S0100000_10 LLLILZ;
    public final boolean LLLILZJ;
    public final C054G LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public SearchRefreshPredictMobCanShowVM LLLJL;
    public boolean LLLL;
    public int LLLLII;
    public final SearchUserViewHolder$lifecycleCallback$1 LLLLIIIILLL;

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final void N5() {
        ((Map) ((C662400PyY) this.LLLIILIL.getValue()).LJFF.getValue()).clear();
    }

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
    public final void R5() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = this.LLJL;
        if (user != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            String searchUserName = user.getSearchUserName();
            if (searchUserName == null) {
                searchUserName = "";
            }
            c1360520lVa.LIZLLL(searchUserName);
            C444910HcX c444910HcX = new C444910HcX(c1360520lVa.LIZ);
            c444910HcX.LIZ(42);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
            C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(numLIZJ != null ? numLIZJ.intValue() : 0), 0, c444910HcX.length(), 33);
            spannableStringBuilder.append((CharSequence) c444910HcX);
            C662710Pz3 c662710Pz3 = this.LLJLLIL;
            if (c662710Pz3 != null) {
                c662710Pz3.LIZ(spannableStringBuilder, "search_user_name", 0);
            }
            if (C1908030zkf.LIZLLL(new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), -1))) {
                TuxIconView tuxIconView = this.LLJJI;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_color_verified_badge);
                }
                TuxIconView tuxIconView2 = this.LLJJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
                TuxIconView tuxIconView3 = this.LLJJI;
                if (tuxIconView3 != null) {
                    tuxIconView3.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
                TuxIconView tuxIconView4 = this.LLJJI;
                if (tuxIconView4 != null) {
                    C786410Ut5.LJLLLLLL(0, tuxIconView4);
                }
            } else {
                TuxIconView tuxIconView5 = this.LLJJI;
                if (tuxIconView5 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxIconView5);
                }
            }
        }
        TuxTextView tuxTextView = this.LLJJ;
        (tuxTextView != null ? tuxTextView : null).setText(spannableStringBuilder);
    }

    public final void S5() {
        Fragment fragmentLIZ;
        User user = this.LLJL;
        if (user != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            C662390PyX.LIZ.getClass();
            c1387050mCN.LIZIZ = !C662390PyX.LIZLLL(user);
            if (C1835007Gq.LIZ() && (fragmentLIZ = C946803n0.LIZ(this.itemView)) != null && fragmentLIZ.getActivity() != null) {
                if (C07H4.LIZ()) {
                    c1387050mCN.LJIIJJI = fragmentLIZ;
                }
                if (C07H6.LIZ()) {
                    c1387050mCN.LJIIL = fragmentLIZ;
                }
            }
            C670070QQb c670070QQb = this.LLJILLL;
            C670070QQb c670070QQb2 = c670070QQb != null ? c670070QQb : null;
            c670070QQb2.getClass();
            if (user.isPendingUnblockRequest()) {
                EnumC662460Pye enumC662460Pye = EnumC662460Pye.EXTRA_STATUS_PARENT_UNBLOCK_REQUESTING;
                c1387050mCN.LJFF = EnumC2274741E1w.CUSTOM_SEARCH_CHILD_SENT_UNBLOCK_REQUEST;
                c670070QQb2.LJJLIIIJILLIZJL(enumC662460Pye, c1387050mCN.LIZ());
            } else if (user.getFpBlockByType() == 2) {
                c670070QQb2.LJJLIIIJILLIZJL(EnumC662460Pye.EXTRA_STATUS_PARENT_BLOCKED, c1387050mCN.LIZ());
            } else {
                c670070QQb2.LJJLIIIJILLIZJL(EnumC662460Pye.EXTRA_STATUS_NONE, c1387050mCN.LIZ());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5() {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC662370PyV.T5():void");
    }

    public final String W5() {
        ProductGroup productGroup;
        Integer num;
        ProductGroup productGroup2;
        Integer num2;
        SearchUser searchUser = this.LLJLIL;
        if (searchUser != null && (productGroup2 = searchUser.productGroup) != null && (num2 = productGroup2.shopType) != null && num2.intValue() == 1) {
            return "window";
        }
        SearchUser searchUser2 = this.LLJLIL;
        return (searchUser2 == null || (productGroup = searchUser2.productGroup) == null || (num = productGroup.shopType) == null || num.intValue() != 2) ? "" : "shop";
    }

    public final String X5() {
        if (Intrinsics.LJFF(l3().LJIIIIZZ, "find_friends")) {
            return Intrinsics.LJFF(l3().LJJIJIIJI, "now_find_friends_search") ? "now_find_friends_page" : "find_friends_page";
        }
        SearchResultParam searchResultParam = this.LLJLLL;
        if (searchResultParam != null) {
            return searchResultParam.getSearchEnterFromPage();
        }
        return null;
    }

    public final String a6() {
        if (l3().LJJLIIIJJIZ != null) {
            return "1";
        }
        SearchUser searchUser = this.LLJLIL;
        return (searchUser == null || !searchUser.isAladdin()) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public final String b6() {
        User user;
        String uid;
        String str = l3().LJJLIIIJILLIZJL;
        if (str.length() > 0) {
            return str;
        }
        SearchUser searchUser = this.LLJLIL;
        return (searchUser == null || (user = searchUser.user) == null || (uid = user.getUid()) == null) ? "" : uid;
    }

    public final String c6() {
        List<Aweme> list;
        if (!TextUtils.isEmpty(l3().LJJLIIIJ)) {
            return l3().LJJLIIIJ;
        }
        SearchUser searchUser = this.LLJLIL;
        return (searchUser == null || (list = searchUser.awemeCards) == null || !(list.isEmpty() ^ true) || this.LLLFFI != 1) ? "person" : "hot_user";
    }

    public final String getEnterFrom() {
        return l3().LIZ ? "general_search" : "search_result";
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: h6, reason: merged with bridge method [inline-methods] */
    public final void onChanged(FollowStatus followStatus) {
        User user = this.LLJL;
        if (user == null || !Intrinsics.LJFF(user.getUid(), followStatus.getUserId())) {
            return;
        }
        r6(followStatus);
        SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) this.LLIZLLLIL.getValue();
        if (searchGlobalViewModel != null) {
            searchGlobalViewModel.vQ2(followStatus.getFollowStatus(), user.getUid());
        }
    }

    public final void i6(User user) {
        User user2 = this.LLJL;
        if (user2 == null || !Intrinsics.LJFF(user2.getUid(), user.getUid())) {
            return;
        }
        user2.setPendingUnblockRequest(true);
        S5();
        T5();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        boolean z;
        boolean zLJFF;
        GlobalDoodleConfig globalDoodleConfig;
        String str;
        String str2;
        String string;
        String uid;
        int i;
        EnterRoomConfig enterRoomConfig;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        boolean z2;
        List<Aweme> list;
        C664030Q2v c664030Q2v;
        C664000Q2s c664000Q2s;
        int i2 = 1;
        if (view != null) {
            interfaceC665370Q7zLJ = C1558360qeg.LJ(view, null);
        } else {
            interfaceC665370Q7zLJ = null;
        }
        new C667750QHd(interfaceC665370Q7zLJ).LJ();
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        if (view != null && view.getId() == R.id.l9h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1050870dS9 c1050870dS9 = C1050870dS9.LIZ;
            User user = this.LLJL;
            c1050870dS9.getClass();
            if (C1050870dS9.LIZ(user)) {
                User user2 = this.LLJL;
                if (user2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C486180J4u.LIZ(user2));
                    String str3 = "";
                    sbLIZ.append("");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C651980Phk c651980Phk = C651970Phj.LLILLL;
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("search_result_id", this.LLJL.getUid());
                    pairArr[1] = new Pair("search_id", l3().LJIIJ);
                    C646000PVm c646000PVm = C650950Pg5.Companion;
                    View view2 = this.itemView;
                    c646000PVm.getClass();
                    C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view2);
                    if (c650960Pg6LJI == null || (c664000Q2s = c650960Pg6LJI.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                        str = "";
                    }
                    pairArr[2] = new Pair("search_entrance", str);
                    pairArr[3] = new Pair("list_item_id", strLIZIZ);
                    C650960Pg6 c650960Pg6LJI2 = C646000PVm.LJI(this.itemView);
                    if (c650960Pg6LJI2 == null || (c664030Q2v = c650960Pg6LJI2.searchVideoModel) == null || (str2 = c664030Q2v.groupId) == null) {
                        str2 = "";
                    }
                    pairArr[4] = new Pair("last_from_group_id", str2);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    c651980Phk.getClass();
                    C651980Phk.LJFF(mapLJIIIIZZ, false);
                    Pair[] pairArr2 = new Pair[2];
                    User user3 = this.LLJL;
                    if (user3 == null || (string = Long.valueOf(C486180J4u.LIZ(user3)).toString()) == null) {
                        string = "";
                    }
                    pairArr2[0] = new Pair("room_id", string);
                    pairArr2[1] = new Pair("list_result_type", "live");
                    f6("click_into_live", C2097608Jq.LJIIIIZZ(pairArr2));
                    long jLIZ = C486180J4u.LIZ(user2);
                    String str4 = l3().LJIIJ;
                    String str5 = l3().LJFF;
                    String str6 = l3().LIZLLL;
                    String uid2 = this.LLJL.getUid();
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    View view3 = this.LLJI;
                    if (view3 == null) {
                        view3 = null;
                    }
                    PageFinder pageFinderVia = PageFinder.via(view3);
                    BcmParams bcmParams = new BcmParams();
                    User user4 = this.LLJL;
                    if (user4 == null || (uid = user4.getUid()) == null) {
                        uid = "";
                    }
                    bcmParams.put("user_id", uid);
                    String str7 = l3().LJIIJ;
                    if (str7 == null) {
                        str7 = "";
                    }
                    bcmParams.put("search_id", str7);
                    String str8 = l3().LJIJI;
                    if (str8 != null) {
                        str3 = str8;
                    }
                    bcmParams.put("search_result_id", str3);
                    String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c7013.d37805", pageFinderVia, bcmParams);
                    EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                    EnterRoomConfig.LogData logData = enterRoomConfig2.mLogData;
                    logData.search_id = str4;
                    logData.search_keyword = str5;
                    logData.search_type = str6;
                    logData.search_result_id = uid2;
                    logData.list_item_id = strLIZIZ;
                    logData.requestId = str4;
                    enterRoomConfig2.mRoomsData.userId = user2.getUid();
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
                    if (user2.secret) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    roomsData.isSecret = i;
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                    roomsData2.enterMethod = "others_photo";
                    roomsData2.followStatus = String.valueOf(user2.getFollowStatus());
                    enterRoomConfig2.mSearchData.uid = user2.getUid();
                    enterRoomConfig2.mLogData.sourceBtmToken = strCreateJumpSourceBtmToken;
                    String str9 = user2.roomData;
                    if (str9 != null) {
                        try {
                            Room room = (Room) C7740030o.LIZ().getGson().LJII(str9, Room.class);
                            if (room != null) {
                                ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                                if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (enterRoomConfig = interfaceC20673515v3K4.LJJIZ(room)) == null) {
                                    enterRoomConfig = new EnterRoomConfig();
                                }
                                enterRoomConfig2 = enterRoomConfig;
                                EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
                                logData2.search_id = str4;
                                logData2.search_keyword = str5;
                                logData2.search_type = str6;
                                logData2.search_result_id = uid2;
                                logData2.list_item_id = strLIZIZ;
                                logData2.requestId = str4;
                                enterRoomConfig2.mRoomsData.userId = user2.getUid();
                                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.mRoomsData;
                                if (!user2.secret) {
                                    i2 = 0;
                                }
                                roomsData3.isSecret = i2;
                                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig2.mRoomsData;
                                roomsData4.enterMethod = "others_photo";
                                roomsData4.followStatus = String.valueOf(user2.getFollowStatus());
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    ArrayList arrayListLJ = C1697810uHb.LJ(Long.valueOf(jLIZ));
                    ArrayList arrayListLJ2 = C1697810uHb.LJ(new RoomInfo(jLIZ, user2.getUid()));
                    C0Q00 c0q00 = C0Q00.LIZ;
                    Context context = getContext();
                    String enterFrom = getEnterFrom();
                    c0q00.getClass();
                    C0Q00.LIZIZ(jLIZ, context, enterRoomConfig2, enterFrom, arrayListLJ, arrayListLJ2);
                    if (C07F4.LIZ()) {
                        SearchUser searchUser = this.LLJLIL;
                        if (searchUser != null && (list = searchUser.awemeCards) != null && (!list.isEmpty())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C0PUV.LIZIZ(null, this.itemView, l3(), EnumC645610PTz.USER_LIVE, true, z2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        SearchUser searchUser2 = this.LLJLIL;
        if (searchUser2 != null && (globalDoodleConfig = searchUser2.mGlobalDoodleConfig) != null) {
            zLJFF = Intrinsics.LJFF(globalDoodleConfig.getHasEcomIntent(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            U5("9", null, C2097908Jt.LIZJ(new Pair("list_result_type", "user")), false, false);
        } else {
            U5(null, null, C2097908Jt.LIZJ(new Pair("list_result_type", "user")), false, false);
        }
    }

    @C14EU
    public final void onContainerLoadingEvent(C0P6F c0p6f) {
        if (c0p6f.LIZIZ == 4) {
            this.LLL = false;
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C1608510rxZ c1608510rxZ;
        C653570PkJ c653570PkJ;
        C652390PiP c652390PiP;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder childViewHolder;
        int bindingAdapterPosition;
        Aweme aweme;
        ArrayList<Aweme> arrayList;
        InterfaceC653610PkN interfaceC653610PkN;
        super.onViewAttachedToWindow(view);
        EventBus.LIZLLL().LJIJJ(this);
        C19EG c19egLIZIZ = null;
        if (this.LLL) {
            if (C0PPZ.LIZ() && Intrinsics.LJFF(getEnterFrom(), "general_search")) {
                if (this.LLLJL == null) {
                    this.LLLJL = C0P72.LIZ(C946803n0.LIZ(this.itemView));
                }
            } else {
                C0PPS.LIZ(this.itemView, new ARunnableS110S0100000_10(this, 158));
                SearchUser searchUser = this.LLJLIL;
                if (searchUser != null && searchUser.hasMedia() && (c653570PkJ = this.LLJJJJ) != null && (c652390PiP = c653570PkJ.LJIIJJI) != null && (recyclerView = c652390PiP.LLILLJJLI) != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null && (childViewHolder = recyclerView.getChildViewHolder(childAt)) != null && (bindingAdapterPosition = childViewHolder.getBindingAdapterPosition()) != -1) {
                            SearchAwemeCardForUser searchAwemeCardForUser = c653570PkJ.LJIIL;
                            if (searchAwemeCardForUser != null && (arrayList = searchAwemeCardForUser.LLILZIL) != null) {
                                aweme = (Aweme) C13LP.LJJJLZIJ(bindingAdapterPosition, arrayList);
                            } else {
                                aweme = null;
                            }
                            SearchAwemeCardForUser searchAwemeCardForUser2 = c653570PkJ.LJIIL;
                            if (searchAwemeCardForUser2 != null) {
                                searchAwemeCardForUser2.LJIJ(aweme, Integer.valueOf(bindingAdapterPosition)).LJIILJJIL();
                            }
                        }
                    }
                }
            }
            C653570PkJ c653570PkJ2 = this.LLJJJJ;
            if (c653570PkJ2 != null) {
                InterfaceC653620PkO interfaceC653620PkO = c653570PkJ2.LJIILJJIL;
                if (interfaceC653620PkO != null) {
                    interfaceC653620PkO.trackVisible();
                }
                if (c653570PkJ2.LIZIZ() && (interfaceC653610PkN = c653570PkJ2.LJIILL) != null) {
                    interfaceC653610PkN.trackVisible();
                }
            }
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C1610770s1D c1610770s1D = this.LLJILJIL;
        if (c1610770s1D == null) {
            c1610770s1D = null;
        }
        Context context = c1610770s1D.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        }
        sAFHelper.getClass();
        Lifecycle lifecycleLJIILLIIL = SAFHelper.LJIILLIIL(view, c19egLIZIZ);
        if (lifecycleLJIILLIIL != null && (c1608510rxZ = this.LLJJL) != null && c1608510rxZ.LIZIZ) {
            lifecycleLJIILLIIL.addObserver(this.LLLLIIIILLL);
        }
        C0Q2G c0q2g = this.LLJJJJLIIL;
        if (c0q2g != null && c0q2g.LIZ() && !c0q2g.LLJI && c0q2g.LLJIJIL) {
            c0q2g.LLJI = true;
            C1548820qPI.LIZLLL("live_event_update_result", c0q2g);
        }
        this.LLLL = true;
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C1608510rxZ c1608510rxZ;
        super.onViewDetachedFromWindow(view);
        EventBus.LIZLLL().LJJI(this);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C1610770s1D c1610770s1D = this.LLJILJIL;
        C19EG c19egLIZIZ = null;
        if (c1610770s1D == null) {
            c1610770s1D = null;
        }
        Context context = c1610770s1D.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        }
        sAFHelper.getClass();
        Lifecycle lifecycleLJIILLIIL = SAFHelper.LJIILLIIL(view, c19egLIZIZ);
        if (lifecycleLJIILLIIL != null && (c1608510rxZ = this.LLJJL) != null && c1608510rxZ.LIZIZ) {
            lifecycleLJIILLIIL.removeObserver(this.LLLLIIIILLL);
        }
        C0Q2G c0q2g = this.LLJJJJLIIL;
        if (c0q2g != null && c0q2g.LIZ()) {
            c0q2g.LLJI = false;
            C1548820qPI.LJIIIIZZ("live_event_update_result", c0q2g);
        }
        this.LLLL = false;
    }

    public final void r6(FollowStatus followStatus) {
        User user;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "disable_relationship", true) == 1 || followStatus == null || (user = this.LLJL) == null || !TextUtils.equals(followStatus.getUserId(), user.getUid())) {
            return;
        }
        if (followStatus.getFollowStatus() == 1 || followStatus.getFollowStatus() == 2 || followStatus.getFollowStatus() == 4) {
            this.LLLII = EnumC662450Pyd.SHOW_FOLLOW;
        }
        if (followStatus.getFollowStatus() == 0) {
            this.LLLII = EnumC662450Pyd.EMPTY;
        }
        int followStatus2 = user.getFollowStatus();
        user.setFollowStatus(followStatus.getFollowStatus());
        if (followStatus2 != followStatus.getFollowStatus()) {
            R5();
        }
        T5();
    }

    public static String e6(User user, EnumC662450Pyd enumC662450Pyd) {
        String strLIZ = C662620Pyu.LIZ(user);
        if (user.getFpBlockByType() == 2) {
            if (user.isPendingUnblockRequest()) {
                return "pending";
            }
            return "blocked for you";
        }
        if (enumC662450Pyd != EnumC662450Pyd.SHOW_BLOCK) {
            return strLIZ;
        }
        return "blocked";
    }

    public final void P5(View view, SearchUser searchUser) {
        C683220Qr2 c683220Qr2;
        String value;
        UrlModel avatarThumb;
        String searchUserName;
        String uniqueId;
        String str;
        String secUid;
        RelativeLayout relativeLayout = null;
        if (this.LLILZIL) {
            if (C123100dR.LIZ(this.LLILZ)) {
                value = this.LLILZ;
            } else {
                value = EnumC682590Qq1.USER.getValue();
            }
            c683220Qr2 = new C683220Qr2(value, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 524286);
            User user = searchUser.user;
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            c683220Qr2.LIZIZ = avatarThumb;
            User user2 = searchUser.user;
            if (user2 != null) {
                searchUserName = user2.getSearchUserName();
            } else {
                searchUserName = null;
            }
            c683220Qr2.LIZJ = searchUserName;
            boolean z = C0Q9J.LIZ;
            c683220Qr2.LIZLLL = C684120QsU.LIZLLL(c683220Qr2.LIZ);
            Pair[] pairArr = new Pair[11];
            pairArr[0] = new Pair("enter_from", getEnterFrom());
            pairArr[1] = new Pair("search_result_id", b6());
            pairArr[2] = new Pair("token_type", c6());
            pairArr[3] = new Pair("is_aladdin", a6());
            int i = searchUser.rank;
            if (i == 0) {
                i = l3().LJIILL;
            }
            pairArr[4] = new Pair("rank", String.valueOf(i));
            pairArr[5] = new Pair("universal_rank", String.valueOf(l3().LJIILLIIL));
            String str2 = l3().LJIIZILJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            pairArr[6] = new Pair("insert_type", str2);
            pairArr[7] = new Pair("list_result_type", "user");
            User user3 = searchUser.user;
            if (user3 == null || (uniqueId = user3.getUniqueId()) == null) {
                uniqueId = "";
            }
            pairArr[8] = new Pair("unique_id", uniqueId);
            User user4 = searchUser.user;
            if (user4 != null && user4.isBlocked()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[9] = new Pair("is_blocked", str);
            User user5 = searchUser.user;
            if (user5 != null && (secUid = user5.getSecUid()) != null) {
                str3 = secUid;
            }
            pairArr[10] = new Pair("sec_user_id", str3);
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (searchUser.isAladdin()) {
                mapLJIIJ.put("aladdin_rank", String.valueOf(getAdapterPosition()));
            } else if (l3().LIZ) {
                mapLJIIJ.put("item_rank", String.valueOf(getAdapterPosition()));
            }
            c683220Qr2.LJ = mapLJIIJ;
        } else {
            c683220Qr2 = null;
        }
        RelativeLayout relativeLayout2 = this.LLJJIJIL;
        if (relativeLayout2 != null) {
            relativeLayout = relativeLayout2;
        }
        I5(view, relativeLayout, c683220Qr2, new ATListenerS444S0100000_10(this, 15));
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            I5(view2, view2, c683220Qr2, new View.OnTouchListener() { // from class: X.0Pyh
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 1) {
                        view3.performClick();
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    public final void f6(String str, Map<String, String> map) {
        String strE6;
        String str2;
        String uniqueId;
        String uid;
        int i;
        Integer numValueOf;
        String string;
        String str3;
        String str4;
        ProductGroup productGroup;
        ShopIcon shopIcon;
        Integer num;
        boolean z;
        String uid2;
        String searchUserName;
        User user;
        String aid;
        String searchUserName2;
        List<Aweme> list;
        Aweme aweme;
        List<Aweme> list2;
        String uid3;
        String searchUserName3;
        User user2;
        String aid2;
        String searchUserName4;
        List<Aweme> list3;
        Aweme aweme2;
        ProductGroup productGroup2;
        ShopIcon shopIcon2;
        Integer num2;
        ProductGroup productGroup3;
        ProductGroup productGroup4;
        Integer num3;
        ProductGroup productGroup5;
        List<Product> list4;
        User user3;
        User user4;
        ProductGroup productGroup6;
        User user5;
        C653660PkS c653660PkSL3 = l3();
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkSL3);
        String strC6 = c6();
        SearchUser searchUser = this.LLJLIL;
        String str5 = "";
        if (searchUser == null || (user5 = searchUser.user) == null) {
            strE6 = "";
        } else {
            strE6 = e6(user5, this.LLLII);
        }
        c654740PmCLIZ.LJIIZILJ("token_type", strC6);
        SearchUser searchUser2 = this.LLJLIL;
        if (searchUser2 == null || (productGroup6 = searchUser2.productGroup) == null || !Intrinsics.LJFF(productGroup6.showEntrance, Boolean.TRUE)) {
            str2 = "";
        } else {
            str2 = "showcase_entrance";
        }
        c654740PmCLIZ.LJIIZILJ("product_window_type", str2);
        c654740PmCLIZ.LJIIZILJ("ecom_user_type", W5());
        c654740PmCLIZ.LJIJI("user_tag", strE6);
        SearchUser searchUser3 = this.LLJLIL;
        Aweme aweme3 = null;
        if (searchUser3 != null && (user4 = searchUser3.user) != null) {
            uniqueId = user4.getUniqueId();
        } else {
            uniqueId = null;
        }
        c654740PmCLIZ.LJIIZILJ("user_name", uniqueId);
        SearchUser searchUser4 = this.LLJLIL;
        if (searchUser4 != null && (user3 = searchUser4.user) != null) {
            uid = user3.getUid();
        } else {
            uid = null;
        }
        c654740PmCLIZ.LJIIZILJ("user_list", uid);
        c654740PmCLIZ.LJIIZILJ("is_aladdin", a6());
        SearchUser searchUser5 = this.LLJLIL;
        if (searchUser5 != null && (productGroup5 = searchUser5.productGroup) != null && (list4 = productGroup5.productList) != null && (!list4.isEmpty())) {
            i = 1;
        } else {
            i = 0;
        }
        c654740PmCLIZ.LJJIJLIJ(Integer.valueOf(i));
        c654740PmCLIZ.LJIJI("search_result_id", b6());
        User user6 = this.LLJL;
        if (user6 != null) {
            numValueOf = Integer.valueOf(C662440Pyc.LIZ(user6));
        } else {
            numValueOf = null;
        }
        c654740PmCLIZ.LJIIZILJ("relation_tag", String.valueOf(numValueOf));
        c654740PmCLIZ.LJIIZILJ("search_type", l3().LIZLLL);
        String str6 = this.LLJZ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c654740PmCLIZ.LJFF("section_type", str6, c2082308Dt);
        SearchUser searchUser6 = this.LLLI;
        if (searchUser6 == null || (productGroup4 = searchUser6.productGroup) == null || (num3 = productGroup4.productVolume) == null || (string = num3.toString()) == null) {
            string = "";
        }
        c654740PmCLIZ.LJFF("product_volume", string, c2082308Dt);
        SearchUser searchUser7 = this.LLLI;
        if (searchUser7 != null && (productGroup3 = searchUser7.productGroup) != null && productGroup3.soldCount != null) {
            str3 = "sold";
        } else {
            str3 = "products";
        }
        c654740PmCLIZ.LJFF("volume_type", str3, c2082308Dt);
        SearchUser searchUser8 = this.LLLI;
        if (searchUser8 != null && (productGroup2 = searchUser8.productGroup) != null && (shopIcon2 = productGroup2.shopIcon) != null && (num2 = shopIcon2.iconType) != null && num2.intValue() == 8) {
            str4 = "top_choice";
        } else {
            SearchUser searchUser9 = this.LLLI;
            if (searchUser9 == null || (productGroup = searchUser9.productGroup) == null || (shopIcon = productGroup.shopIcon) == null || (num = shopIcon.iconType) == null || num.intValue() != 10) {
                str4 = "";
            } else {
                str4 = "mall";
            }
        }
        c654740PmCLIZ.LJ("usercard_tag_type", str4);
        SearchUser searchUser10 = this.LLJLIL;
        if (searchUser10 != null && searchUser10.isAladdin()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c654740PmCLIZ.LJIIZILJ("aladdin_button_type", str);
            if (Intrinsics.LJFF(str, "click_video")) {
                SearchUser searchUser11 = this.LLJLIL;
                if (searchUser11 == null || (list3 = searchUser11.awemeCards) == null || (aweme2 = (Aweme) ListProtector.get(list3, 0)) == null || (aid2 = aweme2.getAid()) == null) {
                    aid2 = "";
                }
                c654740PmCLIZ.LJIIZILJ("list_item_id", aid2);
                c654740PmCLIZ.LJJIJL(0);
                User user7 = this.LLJL;
                if (user7 == null || (searchUserName4 = user7.getSearchUserName()) == null) {
                    searchUserName4 = "";
                }
                c654740PmCLIZ.LJ("aladdin_words", searchUserName4);
            } else {
                SearchUser searchUser12 = this.LLJLIL;
                if (searchUser12 == null || (user2 = searchUser12.user) == null || (uid3 = user2.getUid()) == null) {
                    uid3 = "";
                }
                c654740PmCLIZ.LJIIZILJ("list_item_id", uid3);
                c654740PmCLIZ.LJJIJL(Integer.valueOf(getAdapterPosition()));
                User user8 = this.LLJL;
                if (user8 == null || (searchUserName3 = user8.getSearchUserName()) == null) {
                    searchUserName3 = "";
                }
                c654740PmCLIZ.LJ("aladdin_words", searchUserName3);
            }
        } else {
            c654740PmCLIZ.LJIIZILJ("button_type", str);
            if (l3().LIZ) {
                c654740PmCLIZ.LJIIZILJ("item_rank", String.valueOf(getAdapterPosition()));
            }
        }
        if (map != null) {
            c654740PmCLIZ.LIZIZ(map);
        }
        SearchUser searchUser13 = this.LLLI;
        if (searchUser13 != null && (list2 = searchUser13.awemeCards) != null) {
            aweme3 = (Aweme) C13LP.LJJJLL(list2);
        }
        C653400Pk2.LIZIZ(aweme3, c654740PmCLIZ);
        C645930PVf.LIZ(c654740PmCLIZ);
        SearchUser searchUser14 = this.LLJLIL;
        if (searchUser14 != null && searchUser14.isAladdin()) {
            c654740PmCLIZ.LJIIZILJ("aladdin_button_type", str);
            if (Intrinsics.LJFF(str, "click_video")) {
                SearchUser searchUser15 = this.LLJLIL;
                if (searchUser15 == null || (list = searchUser15.awemeCards) == null || (aweme = (Aweme) ListProtector.get(list, 0)) == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                c654740PmCLIZ.LJIIZILJ("list_item_id", aid);
                c654740PmCLIZ.LJJIJL(0);
                User user9 = this.LLJL;
                if (user9 != null && (searchUserName2 = user9.getSearchUserName()) != null) {
                    str5 = searchUserName2;
                }
                c654740PmCLIZ.LJ("aladdin_words", str5);
            } else {
                SearchUser searchUser16 = this.LLJLIL;
                if (searchUser16 == null || (user = searchUser16.user) == null || (uid2 = user.getUid()) == null) {
                    uid2 = "";
                }
                c654740PmCLIZ.LJIIZILJ("list_item_id", uid2);
                c654740PmCLIZ.LJJIJL(Integer.valueOf(getAdapterPosition()));
                User user10 = this.LLJL;
                if (user10 != null && (searchUserName = user10.getSearchUserName()) != null) {
                    str5 = searchUserName;
                }
                c654740PmCLIZ.LJ("aladdin_words", str5);
            }
        }
        c654740PmCLIZ.LJ("module", c653660PkSL3.LJJJJLL);
        c654740PmCLIZ.LJIILJJIL();
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$lifecycleCallback$1] */
    public ViewOnClickListenerC662370PyV(View view, Fragment fragment, InterfaceC653950Pkv interfaceC653950Pkv) {
        int iIntValue;
        int iIntValue2;
        super(view);
        this.LLIZ = fragment;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1134));
        this.LLL = true;
        this.LLLFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(590));
        this.LLLIIII = new AObserverS214S0100000_10(this, 130);
        this.LLLIIIIL = new AObserverS214S0100000_10(this, 131);
        this.LLLIIIL = new AObserverS214S0100000_10(this, 132);
        this.LLLIILIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1133));
        this.LLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1122));
        this.LLLILZ = new AwS554S0100000_10(this, 1124);
        this.LLLILZJ = C467860IWi.LIZ(getContext());
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLILZLLLI = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLIZZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1414));
        this.LLLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1140));
        this.LLLJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1149));
        this.LLLLII = -1;
        this.LLLLIIIILLL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder$lifecycleCallback$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                } else if (event == Lifecycle.Event.ON_PAUSE) {
                    onPause();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                C1608510rxZ c1608510rxZ = this.LL.LLJJL;
                if (c1608510rxZ != null) {
                    c1608510rxZ.Ir();
                }
                InterfaceC662550Pyn interfaceC662550Pyn = this.LL.LLJJLIIIJLLLLLLLZ;
                if (interfaceC662550Pyn != null) {
                    interfaceC662550Pyn.LJIIZILJ();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                C1608510rxZ c1608510rxZ = this.LL.LLJJL;
                if (c1608510rxZ != null) {
                    c1608510rxZ.xs();
                }
                InterfaceC662550Pyn interfaceC662550Pyn = this.LL.LLJJLIIIJLLLLLLLZ;
                if (interfaceC662550Pyn != null) {
                    interfaceC662550Pyn.LIZ();
                }
            }
        };
        C654040Pl4.LIZ(fragment);
        view.setImportantForAccessibility(2);
        this.LLJI = view.findViewById(R.id.i33);
        this.LLJ = (C1609500rzA) view.findViewById(R.id.i8g);
        C662390PyX c662390PyX = C662390PyX.LIZ;
        C1610670s13 c1610670s13 = (C1610670s13) view.findViewById(R.id.l9h);
        c662390PyX.getClass();
        C430210Gtv avatarImageView = c1610670s13.getAvatarImageView();
        OvalShape ovalShape = new OvalShape();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, avatarImageView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        int width = avatarImageView.getWidth();
        int height = avatarImageView.getHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(ovalShape);
        shapeDrawable.getPaint().setColor(iIntValue);
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setIntrinsicWidth(width);
        avatarImageView.setPlaceholderImage(shapeDrawable);
        C1331100kk8 c1331100kk8 = ((C1331070kk5) avatarImageView.getHierarchy()).LIZJ;
        if (c1331100kk8 != null) {
            c1331100kk8.LJFF(C418440Gaw.LIZIZ(Float.valueOf(0.5f)));
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ng, avatarImageView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c1331100kk8.LJFF = iIntValue2;
        }
        this.LLJIJIL = c1610670s13;
        this.LLJILJIL = (C1610770s1D) view.findViewById(R.id.l2p);
        this.LLJILJILJ = view.findViewById(R.id.xg_);
        this.LLJILLL = (C670070QQb) view.findViewById(R.id.t4f);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.tv_username);
        this.LLJJI = (TuxIconView) view.findViewById(R.id.y4i);
        this.LLJJIII = (TextView) view.findViewById(R.id.z_w);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.zhs);
        this.LLJJIJIIJIL = (C0QB7) view.findViewById(R.id.oyo);
        this.LLJJJ = (ViewStub) view.findViewById(R.id.user_video_playlist_stub);
        this.LLJJJIL = (ViewStub) view.findViewById(R.id.user_product_list_stub);
        ViewStub viewStub = this.LLJJJ;
        C653570PkJ c653570PkJ = new C653570PkJ(viewStub == null ? null : viewStub, (ViewGroup) view, fragment, new AwS554S0100000_10(this, 1136));
        c653570PkJ.LJJI = new AwS554S0100000_10(this, 1137);
        this.LLJJJJ = c653570PkJ;
        this.LLJJJJLIIL = new C0Q2G((ViewStub) view.findViewById(R.id.mxq));
        C1609500rzA c1609500rzA = this.LLJ;
        c1609500rzA = c1609500rzA == null ? null : c1609500rzA;
        ViewGroup.LayoutParams layoutParams = c1609500rzA.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
            C786410Ut5.W5(c1609500rzA, layoutParams);
            c1609500rzA.setRingStrokeWidthByAvatarSize(56);
            View view2 = this.LLJI;
            view2 = view2 == null ? null : view2;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
                C786410Ut5.W5(view2, layoutParams2);
                C1610670s13 c1610670s132 = this.LLJIJIL;
                c1610670s132 = c1610670s132 == null ? null : c1610670s132;
                ViewGroup.LayoutParams layoutParams3 = c1610670s132.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                    C786410Ut5.W5(c1610670s132, layoutParams3);
                    C786410Ut5.I7(this, view);
                    C1610670s13 c1610670s133 = this.LLJIJIL;
                    C786410Ut5.S9(c1610670s133 == null ? null : c1610670s133, this);
                    C1610670s13 c1610670s134 = this.LLJIJIL;
                    (c1610670s134 == null ? null : c1610670s134).setAvatarRoundingPadding(0.0f);
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.u89);
                    C786410Ut5.S7(relativeLayout, new ACListenerS114S0200000_10(relativeLayout, this, 25));
                    this.LLJJIJIL = relativeLayout;
                    Integer numValueOf = Integer.valueOf(C1913107eT.LJFF());
                    if (numValueOf.intValue() > 0) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf));
                        C1610670s13 c1610670s135 = this.LLJIJIL;
                        ViewGroup.LayoutParams layoutParams4 = (c1610670s135 == null ? null : c1610670s135).getLayoutParams();
                        int marginStart = iLIZIZ - (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0);
                        if (marginStart > 0) {
                            View view3 = this.LLJI;
                            C0HXV.LJI(marginStart, view3 == null ? null : view3);
                        }
                        View view4 = this.LLJILJILJ;
                        C0HXV.LIZIZ(iLIZIZ, view4 != null ? view4 : null);
                    }
                    this.LLJLILLLLZIIL = interfaceC653950Pkv;
                    C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this, view, 87));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void q6(String str, Map map, boolean z) {
        int i;
        String str2;
        String str3;
        String str4;
        C664000Q2s c664000Q2s;
        String str5;
        C664030Q2v c664030Q2v;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C0Q3E.LIZ(this.itemView).Ph1().LIZJ();
        C646000PVm c646000PVm = C650950Pg5.Companion;
        View view = this.itemView;
        c646000PVm.getClass();
        if (view != null && (interfaceC665370Q7zLJIIL = C646000PVm.LJIIL(view)) != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJIIL, "source_default_key", C650950Pg5.class, null)) != null) {
            interfaceC1555100qZQLIZIZ.getSource();
        }
        C0PRW c0prwLIZLLL = C646000PVm.LIZLLL(this.itemView);
        if (c0prwLIZLLL != null) {
            i = c0prwLIZLLL.tabIndex;
        } else {
            i = 0;
        }
        String strLJIILLIIL = C644560PPy.LJIILLIIL(i);
        C651980Phk c651980Phk = C651970Phj.LLILLL;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("search_result_id", b6());
        String str6 = "";
        if (c0prwLIZLLL == null || (str2 = c0prwLIZLLL.searchId) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("search_id", str2);
        pairArr[2] = new Pair("is_search_scene", "1");
        if (c0prwLIZLLL == null || (str3 = c0prwLIZLLL.searchKeyword) == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("search_keyword", str3);
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(this.itemView);
        if (c650960Pg6LJI == null || (c664030Q2v = c650960Pg6LJI.searchVideoModel) == null || (str4 = c664030Q2v.groupId) == null) {
            str4 = "";
        }
        pairArr[4] = new Pair("last_from_group_id", str4);
        pairArr[5] = new Pair("search_type", strLJIILLIIL);
        C650960Pg6 c650960Pg6LJI2 = C646000PVm.LJI(this.itemView);
        if (c650960Pg6LJI2 != null && (c664000Q2s = c650960Pg6LJI2.searchCommonModel) != null && (str5 = c664000Q2s.enterFrom) != null) {
            str6 = str5;
        }
        pairArr[6] = new Pair("search_entrance", str6);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c651980Phk.getClass();
        C651980Phk.LJFF(mapLJIIIIZZ, false);
        if (!C703302op.LIZ(str)) {
            if (z) {
                str = "click_see_all";
            } else {
                str = "click_info";
            }
        }
        f6(str, map);
    }

    public static final void d6(C430210Gtv c430210Gtv, User user, int i, String str, C658350Ps1 c658350Ps1) {
        c430210Gtv.LJIIJ(user.getAvatarThumb(), C422830Gi1.LIZ(101), i, i, str, true, c658350Ps1);
    }

    public final void U5(String str, String str2, Map map, boolean z, boolean z2) {
        String strE6;
        User user;
        String strLIZIZ;
        String uid;
        String requestId;
        User user2;
        q6(str2, map, z);
        SearchUser searchUser = this.LLJLIL;
        String str3 = "";
        if (searchUser == null || (user2 = searchUser.user) == null) {
            strE6 = "";
        } else {
            strE6 = e6(user2, this.LLLII);
        }
        User user3 = this.LLJL;
        String str4 = null;
        if ((user3 == null || (requestId = user3.getRequestId()) == null || requestId.length() == 0) && (user = this.LLJL) != null) {
            user.setRequestId(l3().LJIIJ);
        }
        C653930Pkt c653930Pkt = new C653930Pkt();
        c653930Pkt.LIZ = this.itemView;
        c653930Pkt.LIZIZ = this.LLJL;
        c653930Pkt.LIZLLL = getAdapterPosition();
        c653930Pkt.LJ = strE6;
        c653930Pkt.LJFF = str;
        if (C300140Bpc.LIZ()) {
            strLIZIZ = "click_card";
        } else {
            strLIZIZ = C663370Q0h.LIZIZ(l3().LJFF);
        }
        c653930Pkt.LJI = strLIZIZ;
        c653930Pkt.LJII = z2;
        c653930Pkt.LJIIIIZZ = X5();
        SearchUser searchUser2 = this.LLLI;
        if (searchUser2 != null) {
            str4 = searchUser2.entityType;
        }
        c653930Pkt.LJIIIZ = str4;
        c653930Pkt.LJIIJ = z;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        PageFinder pageFinderVia = PageFinder.via(this.itemView);
        BcmParams bcmParams = new BcmParams();
        User user4 = this.LLJL;
        if (user4 == null || (uid = user4.getUid()) == null) {
            uid = "";
        }
        bcmParams.put("user_id", uid);
        String str5 = l3().LJIIJ;
        if (str5 == null) {
            str5 = "";
        }
        bcmParams.put("search_id", str5);
        String str6 = l3().LJIJI;
        if (str6 != null) {
            str3 = str6;
        }
        bcmParams.put("search_result_id", str3);
        c653930Pkt.LIZJ = btmSDK.createJumpSourceBtmToken("c7013.d0", pageFinderVia, bcmParams);
        User user5 = this.LLJL;
        if (user5 != null) {
            ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LIZ(user5);
        }
        InterfaceC653950Pkv interfaceC653950Pkv = this.LLJLILLLLZIIL;
        if (interfaceC653950Pkv != null) {
            interfaceC653950Pkv.LIZ(c653930Pkt);
        }
        InterfaceC662610Pyt interfaceC662610Pyt = this.LLJLL;
        if (interfaceC662610Pyt != null) {
            interfaceC662610Pyt.LIZIZ();
        }
    }
}

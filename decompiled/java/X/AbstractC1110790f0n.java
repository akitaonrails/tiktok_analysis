package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.ArrayMap;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.LiveNotifyFontWeightOptSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.LiveShouldShowGrayBadgeTypes;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenEffectiveDurationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1110790f0n implements InterfaceC1109650eyx, InterfaceC1113750f5Z, InterfaceC1110010ezX, InterfaceC1133840fby {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public String LJI;
    public boolean LJIIJJI;
    public volatile CharSequence LJIIL;
    public C1109770ez9 LJIILIIL;
    public Map<User, C520950Kbt> LJIJI;
    public boolean LIZLLL = true;
    public long LJFF = -1;
    public final C1111910f2b LJII = new C1111910f2b();
    public Pair<? extends EnumC1110950f13, PublicAreaMessageCommon.OperationState> LJIIIIZZ = new Pair<>(EnumC1110950f13.OPERATION_STATE_UNSET_STATUS, null);
    public final C1110920f10 LJIIIZ = new C1110920f10();
    public final int LJIIJ = LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
    public final C1110880f0w LJIILJJIL = new C1110880f0w();
    public final C1110910f0z LJIILL = new C1110910f0z();
    public final C1112650f3n LJIILLIIL = new C1112650f3n();
    public final C1109640eyw LJIIZILJ = new C1109640eyw();
    public final C1111420f1o LJIJ = new C1111420f1o();
    public final BPEAHandler LJIJJ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1133840fby
    public /* synthetic */ boolean LIZ() {
        return true;
    }

    public int LIZLLL() {
        return R.drawable.eu1;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC1109570eyp
    public C234900vT LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC1112060f2q
    public int LJIJI() {
        return 0;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJ() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJIIZ() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJIIZI() {
        return false;
    }

    @Override // X.InterfaceC1133840fby
    public int LJJIJ() {
        return 0;
    }

    @Override // X.InterfaceC1112690f3r
    public void LJJIJIL() {
        this.LJIIJJI = true;
    }

    public boolean LJJIJLIJ() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public void LJJIL(int i) {
    }

    public boolean LJJJJ() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJJJIZL() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJJJJ() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public void LJJJJJL(int i) {
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJJJLI() {
        return false;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJJJZI() {
        return true;
    }

    @Override // X.InterfaceC1112060f2q
    public long LJJJLIIL() {
        return 0L;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJJLIIIJL() {
        return false;
    }

    public /* synthetic */ void LJJLIIJ(C443120HZe c443120HZe) {
    }

    public /* synthetic */ boolean LJJLIL() {
        return true;
    }

    public Integer LJJZ() {
        return null;
    }

    public boolean LJJZZI() {
        return true;
    }

    @Override // X.InterfaceC1112060f2q
    public long LJLILLLLZI() {
        return 0L;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJLJJI() {
        return false;
    }

    public C234700vR LJLJJLL() {
        return null;
    }

    @Override // X.InterfaceC1133840fby
    public /* synthetic */ InterfaceC1114100f68 LJLL() {
        return null;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJLZ() {
        return false;
    }

    @Override // X.InterfaceC1111840f2U
    public void LJZ() {
    }

    public void LJZI(UserProfileEvent userProfileEvent) {
    }

    public boolean LL() {
        return true;
    }

    public InterfaceC1110040eza LLD() {
        return null;
    }

    public InterfaceC1110040eza LLF() {
        return null;
    }

    public CharSequence LLFF() {
        return null;
    }

    public int LLFII() {
        return 0;
    }

    public Text LLFZ() {
        return null;
    }

    public int LLIFFJFJJ() {
        return 0;
    }

    public String LLII() {
        return null;
    }

    public PublicAreaMessageCommon LLIIII() {
        return null;
    }

    public String LLIIIJ() {
        return null;
    }

    public boolean LLIIJLIL() {
        return this instanceof C181000mm;
    }

    public boolean LLILII() {
        return false;
    }

    public /* synthetic */ boolean LLILIL() {
        return false;
    }

    public boolean LLILL() {
        return this instanceof C245000x6;
    }

    public InterfaceC1110040eza LLILLIZIL() {
        return null;
    }

    public void LLILZ(BadgeStruct badgeStruct) {
    }

    public void LLILZIL() {
    }

    public Map<String, String> LLJ() {
        return null;
    }

    public void LLJIJIL(int i, User user) {
    }

    public void LLJILJIL(User user) {
    }

    public boolean LLJILJILJ(AwS383S0200000_17 awS383S0200000_17) {
        return false;
    }

    public boolean LLJILLL() {
        return this instanceof C161800jg;
    }

    public boolean LLJJ() {
        return false;
    }

    public /* synthetic */ boolean LLJJI() {
        return true;
    }

    public boolean LLJJIJIL() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0GVo] */
    @Override // X.InterfaceC1133840fby
    public final C416700GVo LJIIJ() {
        FansClubDynamicConfig fansClubDynamicConfig;
        FansClubConfig fansClubConfig = FansClubSettings.INSTANCE.getFansClubConfig();
        final int iLJIIIZ = ((fansClubConfig == null || (fansClubDynamicConfig = fansClubConfig.fansClubDynamicConfig) == null) ? 1 : fansClubDynamicConfig.badgeMarginSpanFactor) * C497740JfY.LJIIIZ(R.dimen.avh);
        return new ReplacementSpan(iLJIIIZ) { // from class: X.0GVo
            public final int LL;

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            }

            {
                this.LL = iLJIIIZ;
            }

            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                return this.LL;
            }
        };
    }

    @Override // X.InterfaceC1133840fby
    public boolean LJIJ() {
        return !LiveNotifyFontWeightOptSetting.INSTANCE.isPublicScreenMessageFontWeightOpt();
    }

    @Override // X.InterfaceC1111840f2U
    public void LJJIJIIJIL() {
        Text textLLFZ;
        List<TextPiece> list;
        TextPieceUser textPieceUser;
        boolean z;
        int iLIZIZ;
        Map<User, C520950Kbt> map;
        if (this.LJ) {
            return;
        }
        boolean z2 = true;
        this.LJ = true;
        boolean z3 = false;
        if (this.LIZLLL && ((!LLIIIILZ().LJFF || this.LIZJ) && LLJILLL() && LLJJIJIL() && (textLLFZ = LLFZ()) != null && (list = textLLFZ.pieces) != null)) {
            boolean z4 = true;
            for (TextPiece textPiece : (ArrayList) C13LP.LJJJJLI(list)) {
                if (textPiece.type == EnumC1133850fbz.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null) {
                    List<BadgeStruct> listLLI = LLI(textPieceUser.user, z4);
                    if (listLLI != null) {
                        boolean z5 = ((ArrayList) listLLI).size() < 2;
                        if (listLLI != null) {
                            for (BadgeStruct badgeStruct : (ArrayList) listLLI) {
                                if (this.LJIJI == null) {
                                    this.LJIJI = new LinkedHashMap();
                                }
                                if (z5 || (map = this.LJIJI) == null || map.containsKey(textPieceUser.user) != z2) {
                                    Map<User, C520950Kbt> map2 = this.LJIJI;
                                    if (map2 != null) {
                                        User user = textPieceUser.user;
                                        C520950Kbt c520950Kbt = new C520950Kbt(this.LJIJJ, null, z3, C497740JfY.LJJ());
                                        if (LLIIIZ(badgeStruct) == 0) {
                                            iLIZIZ = (int) C497740JfY.LIZIZ(2.0f);
                                            z = false;
                                        } else {
                                            z = true;
                                            iLIZIZ = 0;
                                        }
                                        C160700jV c160700jV = C160700jV.LIZ;
                                        int i = badgeStruct.badgeScene;
                                        c160700jV.getClass();
                                        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.sj);
                                        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.sj);
                                        if (i == 8 || i == 10 || i == 14) {
                                            iLJIIIZ = 0;
                                            iLJIIIZ2 = 0;
                                        }
                                        C521100Kc8 c521100Kc8 = new C521100Kc8(z3, z3, z3, z3, z3, z3, z3, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, z3 ? 1 : 0, null, z3, z3, z3, 268435455);
                                        c521100Kc8.LJII = iLIZIZ;
                                        c521100Kc8.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.sr);
                                        c521100Kc8.LJIILLIIL = C497740JfY.LJIIIZ(R.dimen.sr);
                                        c521100Kc8.LJIIJJI = iLJIIIZ;
                                        c521100Kc8.LJIIL = iLJIIIZ2;
                                        c521100Kc8.LJIIJ = C497740JfY.LJIIIZ(R.dimen.sz);
                                        c520950Kbt.LIZIZ = c521100Kc8;
                                        c520950Kbt.LJII = new AwS383S0200000_17(this, (AbstractC1110790f0n) null, (Function1<? super Boolean, Unit>) 88);
                                        c520950Kbt.LJIIIIZZ(LLIIIILZ().LJI, LLIIIILZ().LIZ, badgeStruct, null, new C1110850f0t(this), LLIIIILZ().LJJ ? 3 : 1, textPieceUser.user, z, null, false);
                                        map2.put(user, c520950Kbt);
                                    }
                                } else {
                                    Map<User, C520950Kbt> map3 = this.LJIJI;
                                    C520950Kbt c520950Kbt2 = map3 != null ? (C520950Kbt) ((LinkedHashMap) map3).get(textPieceUser.user) : null;
                                    int i2 = LLIIIILZ().LJJ ? 3 : 1;
                                    if (c520950Kbt2 != null) {
                                        c520950Kbt2.LJIIIIZZ(LLIIIILZ().LJI, LLIIIILZ().LIZ, badgeStruct, null, new C1110840f0s(this), i2, textPieceUser.user, z3, null, z3);
                                    }
                                }
                                z2 = true;
                                z3 = false;
                            }
                        }
                    }
                    z4 = false;
                }
            }
        }
        C1110880f0w c1110880f0w = this.LJIILJJIL;
        c1110880f0w.LIZIZ = c1110880f0w.LIZ == LLIIIILZ().LJIIJJI.LJJJIL();
    }

    public final C1142400fpm LLFFF() {
        if (this.LJIILIIL != null) {
            return C1136820fgm.LJ(LLIIIILZ().LJIIIZ);
        }
        return null;
    }

    public final C1109770ez9 LLIIIILZ() {
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9 != null) {
            return c1109770ez9;
        }
        return null;
    }

    public String LLIIIL() {
        return this.LJIIZILJ.LIZIZ ? "pin_comment" : "normal";
    }

    public final void LLIZ() {
        List<BadgeStruct> listLLI;
        boolean z;
        int iLIZIZ;
        Map<User, C520950Kbt> map;
        User user = getUser();
        if (user == null || (listLLI = LLI(user, true)) == null) {
            return;
        }
        boolean z2 = ((ArrayList) listLLI).size() < 2;
        if (listLLI != null) {
            for (BadgeStruct badgeStruct : (ArrayList) listLLI) {
                if (this.LJIJI == null) {
                    this.LJIJI = new LinkedHashMap();
                }
                if (z2 || (map = this.LJIJI) == null || !map.containsKey(user)) {
                    Map<User, C520950Kbt> map2 = this.LJIJI;
                    if (map2 != null) {
                        C520950Kbt c520950Kbt = new C520950Kbt(this.LJIJJ, null, false, C497740JfY.LJJ());
                        if (LLIIIZ(badgeStruct) == 0) {
                            iLIZIZ = (int) C497740JfY.LIZIZ(2.0f);
                            z = false;
                        } else {
                            z = true;
                            iLIZIZ = 0;
                        }
                        C521100Kc8 c521100Kc8 = new C521100Kc8(false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, false, false, false, 268435455);
                        c521100Kc8.LJII = iLIZIZ;
                        c521100Kc8.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.sr);
                        c521100Kc8.LJIILLIIL = C497740JfY.LJIIIZ(R.dimen.sr);
                        c521100Kc8.LJIIJJI = C497740JfY.LJIIIZ(R.dimen.sj);
                        c521100Kc8.LJIIL = C497740JfY.LJIIIZ(R.dimen.sj);
                        c521100Kc8.LJIIJ = C497740JfY.LJIIIZ(R.dimen.sz);
                        c520950Kbt.LIZIZ = c521100Kc8;
                        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) this;
                        c520950Kbt.LJII = new AwS596S0100000_17(abstractC1110800f0o, 440);
                        c520950Kbt.LJIIIIZZ(LLIIIILZ().LJI, LLIIIILZ().LIZ, badgeStruct, null, new C1110830f0r(abstractC1110800f0o), LLIIIILZ().LJJ ? 3 : 1, user, z, null, false);
                        map2.put(user, c520950Kbt);
                    }
                } else {
                    Map<User, C520950Kbt> map3 = this.LJIJI;
                    C520950Kbt c520950Kbt2 = map3 != null ? (C520950Kbt) ((LinkedHashMap) map3).get(user) : null;
                    int i = LLIIIILZ().LJJ ? 3 : 1;
                    if (c520950Kbt2 != null) {
                        c520950Kbt2.LJIIIIZZ(LLIIIILZ().LJI, LLIIIILZ().LIZ, badgeStruct, null, new C1110820f0q((AbstractC1110800f0o) this), i, user, false, null, false);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1112060f2q
    public CharSequence getContent() {
        if (TextUtils.isEmpty(this.LJIIL)) {
            this.LJIIL = (!LLJJIJIL() || LLFZ() == null) ? LLFF() : LLIZLLLIL();
        }
        return this.LJIIL;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean instant() {
        return this.LJIIJJI && this.LIZJ;
    }

    public int LJIIL() {
        return C20736316Cj.LIZIZ(R.attr.c9l, LLIIIILZ().LIZ);
    }

    public boolean LJIIZILJ() {
        return LJLJJL() > 0;
    }

    public long LJJII() {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        if (publicAreaMessageCommonLLIIII == null || (messageDisplayInfo = publicAreaMessageCommonLLIIII.displayInfo) == null) {
            return 0L;
        }
        return messageDisplayInfo.showDurationMs;
    }

    public boolean LJJJLL() {
        return getUser() != null;
    }

    public boolean LJJLJ() {
        return LLIL() ? LJJIJLIJ() : LJJJJ();
    }

    public int LJLJJL() {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        if (publicAreaMessageCommonLLIIII == null || (messageDisplayInfo = publicAreaMessageCommonLLIIII.displayInfo) == null) {
            return 0;
        }
        return messageDisplayInfo.durationType;
    }

    @Override // X.InterfaceC1112570f3f
    public final long LJLJLJ() {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        if (publicAreaMessageCommonLLIIII == null || (messageDisplayInfo = publicAreaMessageCommonLLIIII.displayInfo) == null) {
            return 0L;
        }
        return messageDisplayInfo.incrDurationMs;
    }

    @Override // X.InterfaceC1112060f2q
    public boolean LJLLILLLL() {
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = LLIIII();
        return (publicAreaMessageCommonLLIIII == null || (messageDisplayInfo = publicAreaMessageCommonLLIIII.displayInfo) == null || messageDisplayInfo.stayStyle != 1) ? false : true;
    }

    public int LJLLLL() {
        return C497740JfY.LJFF(R.color.a8v);
    }

    public ImageModel LJLLLLLL() {
        User user;
        ImageModel avatarThumb;
        List urls;
        User user2;
        if (!LLJJIJIIJIL() || (user = getUser()) == null || (avatarThumb = user.getAvatarThumb()) == null || (urls = avatarThumb.getUrls()) == null || urls.isEmpty() || (user2 = getUser()) == null) {
            return null;
        }
        return user2.getAvatarThumb();
    }

    public final long LJZL() {
        return LLIIIILZ().LJIL;
    }

    public final long LLIIJI() {
        User user = getUser();
        if (user != null) {
            return user.getId();
        }
        return 0L;
    }

    public final boolean LLIIL() {
        User user;
        UserAttr userAttr;
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        return (dataChannel == null || (user = (User) dataChannel.gg0(RoomUserChannel.class)) == null || (userAttr = user.getUserAttr()) == null || !userAttr.isAdmin) ? false : true;
    }

    public boolean LLIILII() {
        return LLIIIILZ().LJI;
    }

    public final boolean LLIILZL() {
        return LLIIJI() != 0 && LLIIJI() == LLIIIILZ().LJIL;
    }

    public boolean LLILLJJLI() {
        return LLJJIJIIJIL() && LLIIIILZ().LJI && !LiveHostAutoAdaptiveParams.disablePreloadPublicScreenIcon();
    }

    public void LLILZLL() {
        int iLLIFFJFJJ = LLIFFJFJJ();
        if (iLLIFFJFJJ == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_message_click");
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII(this.LJIILL.LIZ ? "fold" : "unfold", "msg_position");
        c474500IjALIZ.LJJII(Integer.valueOf(iLLIFFJFJJ), "msg_type");
        c474500IjALIZ.LJJII("user", "click_position");
        c474500IjALIZ.LJJII(LLIILII() ? "anchor" : "viewer", "admin_type");
        c474500IjALIZ.LJJIIZI(LLJ());
        c474500IjALIZ.LIZ();
    }

    public CharSequence LLIZLLLIL() {
        return C154600iW.LIZ(LLFZ(), this);
    }

    public final void LLJI() {
        LLJJIJI((!LLJJIJIL() || LLFZ() == null) ? LLFF() : LLIZLLLIL());
    }

    public final long LLJJIII() {
        return LLIIIILZ().LJIIZILJ;
    }

    public boolean LLJJIJIIJIL() {
        return LLILL() && LLIIIILZ().LJI;
    }

    @Override // X.InterfaceC1112060f2q
    public void dispose() {
        LJJJZ().getClass();
        LLJJIJI(null);
        Map<User, C520950Kbt> map = this.LJIJI;
        if (map != null) {
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                ((C520950Kbt) ((Map.Entry) it2.next()).getValue()).LIZLLL();
            }
        }
        Map<User, C520950Kbt> map2 = this.LJIJI;
        if (map2 != null) {
            ((LinkedHashMap) map2).clear();
        }
        this.LJI = null;
    }

    public int getColor() {
        return C497740JfY.LJFF(R.color.a8v);
    }

    @Override // X.InterfaceC1109570eyp
    public void onAttach() {
        C234900vT c234900vTLJIIIZ = LJIIIZ();
        if (c234900vTLJIIIZ != null) {
            c234900vTLJIIIZ.LIZ = true;
        }
        this.LJIILJJIL.LJFF = SystemClock.uptimeMillis();
        this.LJIILJJIL.LJI = C963140bAe.LIZIZ();
    }

    @Override // X.InterfaceC1112060f2q
    public final long LJIJJLI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1112790f41
    public final C1111420f1o LJJJI() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1112770f3z
    public final C1112650f3n LJJJJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1111840f2U
    public final C1110880f0w LJJJZ() {
        return this.LJIILJJIL;
    }

    public Map LJJLIIIJ() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.InterfaceC1112060f2q
    public final C1109640eyw LJJLIIIJJIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1112680f3q
    public final C1110910f0z LJLIIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1112060f2q
    public final boolean LLIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1112060f2q
    public final long getToken() {
        return this.LIZ;
    }

    public AbstractC1110790f0n(long j) {
        this.LIZ = j;
    }

    public static int LLIIIZ(BadgeStruct badgeStruct) {
        int i = badgeStruct.badgeScene;
        if (i != 4) {
            if (i != 6) {
                if (i != 8 && i != 10 && i != 14) {
                    return 0;
                }
                return 1;
            }
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC1109650eyx
    public final void LIZJ(C1109770ez9 c1109770ez9) {
        this.LJIILIIL = c1109770ez9;
        LJLI(c1109770ez9);
    }

    @Override // X.InterfaceC1109650eyx
    public final void LJII(C1109770ez9 c1109770ez9) {
        this.LJIILIIL = c1109770ez9;
        LJJJJZ(c1109770ez9);
    }

    @Override // X.InterfaceC1133840fby
    public final C1110590f0T LJJIIJ(User user) {
        Map<User, C520950Kbt> map;
        C520950Kbt c520950Kbt;
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list;
        AbstractC498530Jgp abstractC498530Jgp;
        if (!this.LIZLLL || !LLJJI() || ((LLIIIILZ().LJFF && !this.LIZJ) || (map = this.LJIJI) == null || (c520950Kbt = (C520950Kbt) ((LinkedHashMap) map).get(user)) == null || (list = c520950Kbt.LJ) == null || (abstractC498530Jgp = (AbstractC498530Jgp) C13LP.LJJJLL(list)) == null || !(abstractC498530Jgp instanceof C520960Kbu))) {
            return null;
        }
        if (LLIIIILZ().LJJ) {
            abstractC498530Jgp.LIZJ().LIZJ = C497740JfY.LJIIIZ(R.dimen.ang);
            abstractC498530Jgp.LIZJ().LIZLLL = 9;
        } else {
            abstractC498530Jgp.LIZJ().LIZJ = C1152540g68.LJFF(LLIILII());
            abstractC498530Jgp.LIZJ().LIZLLL = C1152540g68.LJI(LLIILII());
        }
        if (LiveNotifyFontWeightOptSetting.INSTANCE.isPublicScreenBadgeFontWeightOpt()) {
            ((C1113930f5r) abstractC498530Jgp.LIZJ()).LJJJI = OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        return new C1110590f0T(abstractC498530Jgp.LIZJ());
    }

    public BadgeStruct LJJIJIIJI(User user) {
        C520950Kbt c520950Kbt;
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list;
        Object obj;
        InterfaceC1110900f0y interfaceC1110900f0y;
        Map<User, C520950Kbt> map = this.LJIJI;
        if (map == null || (c520950Kbt = map.get(user)) == null || (list = c520950Kbt.LJ) == null || (obj = (AbstractC498530Jgp) C13LP.LJJJLL(list)) == null || !(obj instanceof InterfaceC1110900f0y) || (interfaceC1110900f0y = (InterfaceC1110900f0y) obj) == null) {
            return null;
        }
        return interfaceC1110900f0y.LIZIZ();
    }

    @Override // X.InterfaceC1109570eyp
    public void LJJJJL(boolean z) {
        C234900vT c234900vTLJIIIZ = LJIIIZ();
        if (c234900vTLJIIIZ != null) {
            c234900vTLJIIIZ.LIZ = false;
        }
        C1110880f0w c1110880f0w = this.LJIILJJIL;
        if (c1110880f0w.LJFF > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - c1110880f0w.LJFF;
            long j = c1110880f0w.LJII + jUptimeMillis;
            c1110880f0w.LJII = j;
            c1110880f0w.LJIIIIZZ += jUptimeMillis;
            if (j > 10) {
                c1110880f0w.LJIIIZ++;
                if (!z || (!(this instanceof C1110280ezy))) {
                    LLIIIILZ().LJIIJJI.LIZIZ(this);
                }
                c1110880f0w.LJII = 0L;
            }
            if (c1110880f0w.LJIIIIZZ > LivePublicScreenEffectiveDurationSetting.INSTANCE.getValue()) {
                c1110880f0w.LJIIJ++;
                if (!z || (!(this instanceof C1110280ezy))) {
                    LLIIIILZ().LJIIJJI.LJJIJLIJ(this);
                    LLILZIL();
                }
                c1110880f0w.LJIIIIZZ = 0L;
            }
        }
        c1110880f0w.LJFF = 0L;
    }

    @Override // X.InterfaceC1109650eyx
    public void LJJJJZ(C1109770ez9 c1109770ez9) {
        boolean z;
        ImageModel imageModelLJLLLLLL;
        if (LLIIJI() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
        LLJJIJI(null);
        this.LIZIZ = SystemClock.elapsedRealtimeNanos();
        if (LLILLJJLI() && (imageModelLJLLLLLL = LJLLLLLL()) != null) {
            LLIIIILZ().LJIIJJI.LIZJ();
            C1324570kZb.LJIIIIZZ(imageModelLJLLLLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1133840fby
    public final List<C1110890f0x> LJJLIIIIJ(User user) {
        C520950Kbt c520950Kbt;
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list;
        BadgeStruct badgeStructLIZIZ;
        InterfaceC1110900f0y interfaceC1110900f0y;
        if (!this.LIZLLL) {
            return null;
        }
        if ((LLIIIILZ().LJFF && !this.LIZJ) || !LLJILLL()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Map<User, C520950Kbt> map = this.LJIJI;
        if (map != null && (c520950Kbt = (C520950Kbt) ((LinkedHashMap) map).get(user)) != null && (list = c520950Kbt.LJ) != null) {
            boolean z = false;
            int i = 0;
            for (AbstractC498530Jgp abstractC498530Jgp : (ArrayList) list) {
                if ((abstractC498530Jgp instanceof InterfaceC1110900f0y) && (interfaceC1110900f0y = (InterfaceC1110900f0y) abstractC498530Jgp) != null) {
                    badgeStructLIZIZ = interfaceC1110900f0y.LIZIZ();
                } else {
                    badgeStructLIZIZ = null;
                }
                if ((abstractC498530Jgp instanceof C520960Kbu) && abstractC498530Jgp != 0 && badgeStructLIZIZ != null) {
                    if (LLIIIILZ().LJJ) {
                        abstractC498530Jgp.LIZJ().LIZJ = C497740JfY.LJIIIZ(R.dimen.ang);
                        abstractC498530Jgp.LIZJ().LIZLLL = 9;
                        if (!z && badgeStructLIZIZ != null && LLIIIZ(badgeStructLIZIZ) == 0) {
                            ((C1113930f5r) abstractC498530Jgp.LIZJ()).LJJIFFI = (int) C497740JfY.LIZIZ(4.0f);
                            z = true;
                        }
                    } else {
                        abstractC498530Jgp.LIZJ().LIZJ = C1152540g68.LJFF(LLIILII());
                        abstractC498530Jgp.LIZJ().LIZLLL = C1152540g68.LJI(LLIILII());
                    }
                    if (LiveNotifyFontWeightOptSetting.INSTANCE.isPublicScreenBadgeFontWeightOpt()) {
                        ((C1113930f5r) abstractC498530Jgp.LIZJ()).LJJJI = OppoPermissionPopupMaskDelayExp.DEFAULT;
                    }
                    arrayList.add(new C1110890f0x(new C1110590f0T(abstractC498530Jgp.LIZJ()), badgeStructLIZIZ));
                    i++;
                    if (i >= 2) {
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1109650eyx
    public void LJLI(C1109770ez9 c1109770ez9) {
        this.LJ = false;
    }

    public CharSequence LJLIL(User user) {
        if (LLFII() == 1) {
            return C0KVU.LJ(user);
        }
        return C0KVU.LIZ(user);
    }

    @Override // X.InterfaceC1133840fby
    public final C1110050ezb LJLJL(User user) {
        return new C1110050ezb(user, LLD(), LLF(), LLILIL());
    }

    public void LLILLL(BadgeStruct badgeStruct) {
        boolean z;
        boolean z2;
        Object obj;
        Integer numTL1;
        if (C191100oP.LIZLLL(badgeStruct)) {
            C191100oP.LJFF(LLIIJI(), "comment_area_system_message", LLIILII());
        }
        if (C191100oP.LIZJ(badgeStruct) && badgeStruct != null) {
            long jLLIIJI = LLIIJI();
            long jLJZL = LJZL();
            if (UserService.getInstance().user().getCurrentUserId() == jLJZL) {
                z = true;
            } else {
                z = false;
            }
            if (jLLIIJI == jLJZL) {
                z2 = true;
            } else {
                z2 = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_badge_click");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(C0IUA.LIZJ), "online_user");
            c474500IjALIZ.LJJII("comment_area", "show_place");
            String str = "anchor";
            if (z) {
                obj = "anchor";
            } else {
                obj = "user";
            }
            c474500IjALIZ.LJJII(obj, "user_type");
            if (!z2) {
                str = "user";
            }
            c474500IjALIZ.LJJII(str, "to_user_type");
            c474500IjALIZ.LJJII("fans_club_level", "privilege_scenario");
            IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            Long lEr1 = null;
            if (iPublicScreenService != null) {
                numTL1 = iPublicScreenService.TL1();
            } else {
                numTL1 = null;
            }
            IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            if (iPublicScreenService2 != null) {
                lEr1 = iPublicScreenService2.er1();
            }
            C191100oP.LIZ(c474500IjALIZ, badgeStruct, z, z2, numTL1, lEr1, false);
            c474500IjALIZ.LIZ();
        }
    }

    public void LLJJIJI(CharSequence charSequence) {
        this.LJIIL = charSequence;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ezY] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0ezY] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0ezY] */
    public C1110020ezY LJIILJJIL(int i, User user) {
        if (user == null) {
            return new C1110030ezZ(user, i, null, LLILLIZIL(), new RunnableC514801zW(this, 131)) { // from class: X.0ezY
                public final Runnable LLIZ;
                public final String LLIZLLLIL;
                public final InterfaceC1110040eza LLJ;

                @Override // X.C1110030ezZ, X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    InterfaceC1110040eza interfaceC1110040eza = this.LLJ;
                    if (interfaceC1110040eza != null) {
                        interfaceC1110040eza.LIZIZ();
                        return;
                    }
                    super.LIZIZ(view);
                    Runnable runnable = this.LLIZ;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                @Override // X.C1110030ezZ
                public final void LIZJ(View view, UserProfileEvent userProfileEvent) {
                    long jLongValue;
                    long jLongValue2;
                    String str;
                    long ownerUserId;
                    String str2;
                    String str3;
                    long j;
                    long messageId;
                    Object tag = view.getTag(R.id.yv0);
                    if (tag instanceof String) {
                        userProfileEvent.mEventPage = tag.toString();
                    }
                    Object tag2 = view.getTag(R.id.yuz);
                    if (tag2 instanceof AbstractC1110800f0o) {
                        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) tag2;
                        User user2 = this.LLILZLL;
                        if (user2 != null) {
                            abstractC1110800f0o.LLILLL(abstractC1110800f0o.LJJIJIIJI(user2));
                        }
                        MESSAGE message = abstractC1110800f0o.LJIL;
                        C1109640eyw c1109640eyw = abstractC1110800f0o.LJIIZILJ;
                        if (c1109640eyw.LIZIZ) {
                            userProfileEvent.clickMethod = "pin";
                            C1109020exw c1109020exw = c1109640eyw.LIZJ;
                            if (c1109020exw != null) {
                                PinMessage pinMessage = c1109020exw.LJI;
                                if (pinMessage != null) {
                                    j = pinMessage.pinId;
                                } else {
                                    j = 0;
                                }
                                userProfileEvent.pinId = j;
                                if (pinMessage != null) {
                                    messageId = pinMessage.getMessageId();
                                } else {
                                    messageId = 0;
                                }
                                userProfileEvent.pinMsgId = messageId;
                            }
                        } else {
                            userProfileEvent.clickMethod = "normal";
                        }
                        if (abstractC1110800f0o.LLIFFJFJJ() == 0) {
                            userProfileEvent.clickModule = "user_msg";
                        } else {
                            userProfileEvent.clickModule = "interaction_msg";
                        }
                        C1109770ez9 c1109770ez9 = abstractC1110800f0o.LJIILIIL;
                        if (c1109770ez9.LJJ) {
                            userProfileEvent.mEventPage = "live_extended_comment_filed";
                        }
                        if (c1109770ez9.LJI && abstractC1110800f0o.LLIIII() != null) {
                            if (userProfileEvent.trackExtra == null) {
                                userProfileEvent.trackExtra = new HashMap();
                            }
                            Map<String, String> map = userProfileEvent.trackExtra;
                            if (abstractC1110800f0o.LLIIII().isAnchorMarked) {
                                str3 = "1";
                            } else {
                                str3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("click_is_marked_user", str3);
                        }
                        userProfileEvent.messageType = String.valueOf(abstractC1110800f0o.LLIFFJFJJ());
                        if (message instanceof SocialMessage) {
                            SocialMessage socialMessage = (SocialMessage) message;
                            if (socialMessage.LIZ()) {
                                userProfileEvent.anchorRecommendationType = String.valueOf(socialMessage.action);
                            }
                        }
                        if (message != 0) {
                            userProfileEvent.msgId = message.getMessageId();
                            userProfileEvent.setClickUserPosition(this.LLIZLLLIL);
                            if (message instanceof ChatMessage) {
                                userProfileEvent.content = ((ChatMessage) message).content;
                                return;
                            }
                            if (message instanceof MemberMessage) {
                                MemberMessage memberMessage = (MemberMessage) message;
                                Text text = memberMessage.anchorDisplayText;
                                if (text != null && "pm_mt_guidance_interaction".equals(text.key)) {
                                    HashMap map2 = new HashMap();
                                    map2.put("event_type", "click");
                                    map2.put("click_module", "username");
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interact_notice");
                                    c474500IjALIZ.LJJIIZI(map2);
                                    c474500IjALIZ.LJIL();
                                    c474500IjALIZ.LIZ();
                                }
                                if (memberMessage.hitAbStatus != 1) {
                                    return;
                                }
                                userProfileEvent.clickModule = "live_reflow_system_prompt";
                                return;
                            }
                            String str4 = "";
                            if (message instanceof SubNotifyMessage) {
                                userProfileEvent.setClickUserPosition("subscribe_message");
                                SubNotifyMessage subNotifyMessage = (SubNotifyMessage) message;
                                ArrayMap arrayMap = new ArrayMap();
                                int i2 = subNotifyMessage.subscribeType;
                                if (i2 == 0) {
                                    str2 = "one_month";
                                } else if (i2 != 1) {
                                    str2 = "";
                                } else {
                                    str2 = "auto_sub";
                                }
                                int i3 = subNotifyMessage.oldSubscribeStatus;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                str4 = "resubscribe_beyond_grace_period";
                                            }
                                        } else {
                                            str4 = "resubscribe_within_grace_period";
                                        }
                                    } else {
                                        str4 = "resubscribe";
                                    }
                                } else {
                                    str4 = "first_subscribe";
                                }
                                arrayMap.put("subscribe_type", str2);
                                arrayMap.put("sub_message_type", str4);
                                userProfileEvent.setExtraParams(arrayMap);
                                return;
                            }
                            if (!(message instanceof RankTextMessage)) {
                                return;
                            }
                            userProfileEvent.setClickUserPosition("top_active_user_rank_message");
                            RankTextMessage rankTextMessage = (RankTextMessage) message;
                            ArrayMap arrayMap2 = new ArrayMap();
                            Long l = rankTextMessage.ownerIdxBeforeUpdate;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Long l2 = rankTextMessage.ownerIdxAfterUpdate;
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            if (jLongValue < 0 || jLongValue2 <= 0) {
                                str = "";
                            } else {
                                if (jLongValue > 3 && jLongValue2 <= 3) {
                                    str = "above_top3_change";
                                } else if (jLongValue2 >= 3 || jLongValue2 >= jLongValue) {
                                    str = "";
                                } else {
                                    str = "top3_change";
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(jLongValue2);
                                sbLIZ.append("");
                                arrayMap2.put("to_user_rank", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            arrayMap2.put("top_active_user_rank_message_type", str);
                            long currentUserId = UserService.getInstance().user().getCurrentUserId();
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                                ownerUserId = ((Room) dataChannelGlobal.gg0(C930940aKi.class)).getOwnerUserId();
                            } else {
                                ownerUserId = 0;
                            }
                            if (currentUserId != 0 && dataChannelGlobal.gg0(C930940aKi.class) != null) {
                                if (currentUserId == ownerUserId) {
                                    arrayMap2.put("from_user_rank", "null");
                                } else if (((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF != null) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF.LJJIL);
                                    sbLIZ2.append("");
                                    arrayMap2.put("from_user_rank", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                            userProfileEvent.setExtraParams(arrayMap2);
                        }
                    }
                }

                {
                    this.LLIZLLLIL = str;
                    this.LLILLL = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
                    this.LLIZ = runnable;
                    this.LLJ = interfaceC1110040eza;
                }
            };
        }
        BadgeStruct badgeStructLJJIJIIJI = LJJIJIIJI(user);
        if (badgeStructLJJIJIIJI != null) {
            return new C1110030ezZ(user, i, String.valueOf(badgeStructLJJIJIIJI.badgeScene), LLILLIZIL(), new RunnableC514801zW(this, 132)) { // from class: X.0ezY
                public final Runnable LLIZ;
                public final String LLIZLLLIL;
                public final InterfaceC1110040eza LLJ;

                @Override // X.C1110030ezZ, X.AbstractC1098790ehR
                public final void LIZIZ(View view) {
                    InterfaceC1110040eza interfaceC1110040eza = this.LLJ;
                    if (interfaceC1110040eza != null) {
                        interfaceC1110040eza.LIZIZ();
                        return;
                    }
                    super.LIZIZ(view);
                    Runnable runnable = this.LLIZ;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                @Override // X.C1110030ezZ
                public final void LIZJ(View view, UserProfileEvent userProfileEvent) {
                    long jLongValue;
                    long jLongValue2;
                    String str;
                    long ownerUserId;
                    String str2;
                    String str3;
                    long j;
                    long messageId;
                    Object tag = view.getTag(R.id.yv0);
                    if (tag instanceof String) {
                        userProfileEvent.mEventPage = tag.toString();
                    }
                    Object tag2 = view.getTag(R.id.yuz);
                    if (tag2 instanceof AbstractC1110800f0o) {
                        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) tag2;
                        User user2 = this.LLILZLL;
                        if (user2 != null) {
                            abstractC1110800f0o.LLILLL(abstractC1110800f0o.LJJIJIIJI(user2));
                        }
                        MESSAGE message = abstractC1110800f0o.LJIL;
                        C1109640eyw c1109640eyw = abstractC1110800f0o.LJIIZILJ;
                        if (c1109640eyw.LIZIZ) {
                            userProfileEvent.clickMethod = "pin";
                            C1109020exw c1109020exw = c1109640eyw.LIZJ;
                            if (c1109020exw != null) {
                                PinMessage pinMessage = c1109020exw.LJI;
                                if (pinMessage != null) {
                                    j = pinMessage.pinId;
                                } else {
                                    j = 0;
                                }
                                userProfileEvent.pinId = j;
                                if (pinMessage != null) {
                                    messageId = pinMessage.getMessageId();
                                } else {
                                    messageId = 0;
                                }
                                userProfileEvent.pinMsgId = messageId;
                            }
                        } else {
                            userProfileEvent.clickMethod = "normal";
                        }
                        if (abstractC1110800f0o.LLIFFJFJJ() == 0) {
                            userProfileEvent.clickModule = "user_msg";
                        } else {
                            userProfileEvent.clickModule = "interaction_msg";
                        }
                        C1109770ez9 c1109770ez9 = abstractC1110800f0o.LJIILIIL;
                        if (c1109770ez9.LJJ) {
                            userProfileEvent.mEventPage = "live_extended_comment_filed";
                        }
                        if (c1109770ez9.LJI && abstractC1110800f0o.LLIIII() != null) {
                            if (userProfileEvent.trackExtra == null) {
                                userProfileEvent.trackExtra = new HashMap();
                            }
                            Map<String, String> map = userProfileEvent.trackExtra;
                            if (abstractC1110800f0o.LLIIII().isAnchorMarked) {
                                str3 = "1";
                            } else {
                                str3 = CardStruct.IStatusCode.DEFAULT;
                            }
                            map.put("click_is_marked_user", str3);
                        }
                        userProfileEvent.messageType = String.valueOf(abstractC1110800f0o.LLIFFJFJJ());
                        if (message instanceof SocialMessage) {
                            SocialMessage socialMessage = (SocialMessage) message;
                            if (socialMessage.LIZ()) {
                                userProfileEvent.anchorRecommendationType = String.valueOf(socialMessage.action);
                            }
                        }
                        if (message != 0) {
                            userProfileEvent.msgId = message.getMessageId();
                            userProfileEvent.setClickUserPosition(this.LLIZLLLIL);
                            if (message instanceof ChatMessage) {
                                userProfileEvent.content = ((ChatMessage) message).content;
                                return;
                            }
                            if (message instanceof MemberMessage) {
                                MemberMessage memberMessage = (MemberMessage) message;
                                Text text = memberMessage.anchorDisplayText;
                                if (text != null && "pm_mt_guidance_interaction".equals(text.key)) {
                                    HashMap map2 = new HashMap();
                                    map2.put("event_type", "click");
                                    map2.put("click_module", "username");
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interact_notice");
                                    c474500IjALIZ.LJJIIZI(map2);
                                    c474500IjALIZ.LJIL();
                                    c474500IjALIZ.LIZ();
                                }
                                if (memberMessage.hitAbStatus != 1) {
                                    return;
                                }
                                userProfileEvent.clickModule = "live_reflow_system_prompt";
                                return;
                            }
                            String str4 = "";
                            if (message instanceof SubNotifyMessage) {
                                userProfileEvent.setClickUserPosition("subscribe_message");
                                SubNotifyMessage subNotifyMessage = (SubNotifyMessage) message;
                                ArrayMap arrayMap = new ArrayMap();
                                int i2 = subNotifyMessage.subscribeType;
                                if (i2 == 0) {
                                    str2 = "one_month";
                                } else if (i2 != 1) {
                                    str2 = "";
                                } else {
                                    str2 = "auto_sub";
                                }
                                int i3 = subNotifyMessage.oldSubscribeStatus;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                str4 = "resubscribe_beyond_grace_period";
                                            }
                                        } else {
                                            str4 = "resubscribe_within_grace_period";
                                        }
                                    } else {
                                        str4 = "resubscribe";
                                    }
                                } else {
                                    str4 = "first_subscribe";
                                }
                                arrayMap.put("subscribe_type", str2);
                                arrayMap.put("sub_message_type", str4);
                                userProfileEvent.setExtraParams(arrayMap);
                                return;
                            }
                            if (!(message instanceof RankTextMessage)) {
                                return;
                            }
                            userProfileEvent.setClickUserPosition("top_active_user_rank_message");
                            RankTextMessage rankTextMessage = (RankTextMessage) message;
                            ArrayMap arrayMap2 = new ArrayMap();
                            Long l = rankTextMessage.ownerIdxBeforeUpdate;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Long l2 = rankTextMessage.ownerIdxAfterUpdate;
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            if (jLongValue < 0 || jLongValue2 <= 0) {
                                str = "";
                            } else {
                                if (jLongValue > 3 && jLongValue2 <= 3) {
                                    str = "above_top3_change";
                                } else if (jLongValue2 >= 3 || jLongValue2 >= jLongValue) {
                                    str = "";
                                } else {
                                    str = "top3_change";
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(jLongValue2);
                                sbLIZ.append("");
                                arrayMap2.put("to_user_rank", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            arrayMap2.put("top_active_user_rank_message_type", str);
                            long currentUserId = UserService.getInstance().user().getCurrentUserId();
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                            if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                                ownerUserId = ((Room) dataChannelGlobal.gg0(C930940aKi.class)).getOwnerUserId();
                            } else {
                                ownerUserId = 0;
                            }
                            if (currentUserId != 0 && dataChannelGlobal.gg0(C930940aKi.class) != null) {
                                if (currentUserId == ownerUserId) {
                                    arrayMap2.put("from_user_rank", "null");
                                } else if (((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF != null) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF.LJJIL);
                                    sbLIZ2.append("");
                                    arrayMap2.put("from_user_rank", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                            userProfileEvent.setExtraParams(arrayMap2);
                        }
                    }
                }

                {
                    this.LLIZLLLIL = str;
                    this.LLILLL = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
                    this.LLIZ = runnable;
                    this.LLJ = interfaceC1110040eza;
                }
            };
        }
        return new C1110030ezZ(user, i, null, LLILLIZIL(), new RunnableC514801zW(this, 133)) { // from class: X.0ezY
            public final Runnable LLIZ;
            public final String LLIZLLLIL;
            public final InterfaceC1110040eza LLJ;

            @Override // X.C1110030ezZ, X.AbstractC1098790ehR
            public final void LIZIZ(View view) {
                InterfaceC1110040eza interfaceC1110040eza = this.LLJ;
                if (interfaceC1110040eza != null) {
                    interfaceC1110040eza.LIZIZ();
                    return;
                }
                super.LIZIZ(view);
                Runnable runnable = this.LLIZ;
                if (runnable != null) {
                    runnable.run();
                }
            }

            @Override // X.C1110030ezZ
            public final void LIZJ(View view, UserProfileEvent userProfileEvent) {
                long jLongValue;
                long jLongValue2;
                String str;
                long ownerUserId;
                String str2;
                String str3;
                long j;
                long messageId;
                Object tag = view.getTag(R.id.yv0);
                if (tag instanceof String) {
                    userProfileEvent.mEventPage = tag.toString();
                }
                Object tag2 = view.getTag(R.id.yuz);
                if (tag2 instanceof AbstractC1110800f0o) {
                    AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) tag2;
                    User user2 = this.LLILZLL;
                    if (user2 != null) {
                        abstractC1110800f0o.LLILLL(abstractC1110800f0o.LJJIJIIJI(user2));
                    }
                    MESSAGE message = abstractC1110800f0o.LJIL;
                    C1109640eyw c1109640eyw = abstractC1110800f0o.LJIIZILJ;
                    if (c1109640eyw.LIZIZ) {
                        userProfileEvent.clickMethod = "pin";
                        C1109020exw c1109020exw = c1109640eyw.LIZJ;
                        if (c1109020exw != null) {
                            PinMessage pinMessage = c1109020exw.LJI;
                            if (pinMessage != null) {
                                j = pinMessage.pinId;
                            } else {
                                j = 0;
                            }
                            userProfileEvent.pinId = j;
                            if (pinMessage != null) {
                                messageId = pinMessage.getMessageId();
                            } else {
                                messageId = 0;
                            }
                            userProfileEvent.pinMsgId = messageId;
                        }
                    } else {
                        userProfileEvent.clickMethod = "normal";
                    }
                    if (abstractC1110800f0o.LLIFFJFJJ() == 0) {
                        userProfileEvent.clickModule = "user_msg";
                    } else {
                        userProfileEvent.clickModule = "interaction_msg";
                    }
                    C1109770ez9 c1109770ez9 = abstractC1110800f0o.LJIILIIL;
                    if (c1109770ez9.LJJ) {
                        userProfileEvent.mEventPage = "live_extended_comment_filed";
                    }
                    if (c1109770ez9.LJI && abstractC1110800f0o.LLIIII() != null) {
                        if (userProfileEvent.trackExtra == null) {
                            userProfileEvent.trackExtra = new HashMap();
                        }
                        Map<String, String> map = userProfileEvent.trackExtra;
                        if (abstractC1110800f0o.LLIIII().isAnchorMarked) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        map.put("click_is_marked_user", str3);
                    }
                    userProfileEvent.messageType = String.valueOf(abstractC1110800f0o.LLIFFJFJJ());
                    if (message instanceof SocialMessage) {
                        SocialMessage socialMessage = (SocialMessage) message;
                        if (socialMessage.LIZ()) {
                            userProfileEvent.anchorRecommendationType = String.valueOf(socialMessage.action);
                        }
                    }
                    if (message != 0) {
                        userProfileEvent.msgId = message.getMessageId();
                        userProfileEvent.setClickUserPosition(this.LLIZLLLIL);
                        if (message instanceof ChatMessage) {
                            userProfileEvent.content = ((ChatMessage) message).content;
                            return;
                        }
                        if (message instanceof MemberMessage) {
                            MemberMessage memberMessage = (MemberMessage) message;
                            Text text = memberMessage.anchorDisplayText;
                            if (text != null && "pm_mt_guidance_interaction".equals(text.key)) {
                                HashMap map2 = new HashMap();
                                map2.put("event_type", "click");
                                map2.put("click_module", "username");
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interact_notice");
                                c474500IjALIZ.LJJIIZI(map2);
                                c474500IjALIZ.LJIL();
                                c474500IjALIZ.LIZ();
                            }
                            if (memberMessage.hitAbStatus != 1) {
                                return;
                            }
                            userProfileEvent.clickModule = "live_reflow_system_prompt";
                            return;
                        }
                        String str4 = "";
                        if (message instanceof SubNotifyMessage) {
                            userProfileEvent.setClickUserPosition("subscribe_message");
                            SubNotifyMessage subNotifyMessage = (SubNotifyMessage) message;
                            ArrayMap arrayMap = new ArrayMap();
                            int i2 = subNotifyMessage.subscribeType;
                            if (i2 == 0) {
                                str2 = "one_month";
                            } else if (i2 != 1) {
                                str2 = "";
                            } else {
                                str2 = "auto_sub";
                            }
                            int i3 = subNotifyMessage.oldSubscribeStatus;
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 == 3) {
                                            str4 = "resubscribe_beyond_grace_period";
                                        }
                                    } else {
                                        str4 = "resubscribe_within_grace_period";
                                    }
                                } else {
                                    str4 = "resubscribe";
                                }
                            } else {
                                str4 = "first_subscribe";
                            }
                            arrayMap.put("subscribe_type", str2);
                            arrayMap.put("sub_message_type", str4);
                            userProfileEvent.setExtraParams(arrayMap);
                            return;
                        }
                        if (!(message instanceof RankTextMessage)) {
                            return;
                        }
                        userProfileEvent.setClickUserPosition("top_active_user_rank_message");
                        RankTextMessage rankTextMessage = (RankTextMessage) message;
                        ArrayMap arrayMap2 = new ArrayMap();
                        Long l = rankTextMessage.ownerIdxBeforeUpdate;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long l2 = rankTextMessage.ownerIdxAfterUpdate;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        if (jLongValue < 0 || jLongValue2 <= 0) {
                            str = "";
                        } else {
                            if (jLongValue > 3 && jLongValue2 <= 3) {
                                str = "above_top3_change";
                            } else if (jLongValue2 >= 3 || jLongValue2 >= jLongValue) {
                                str = "";
                            } else {
                                str = "top3_change";
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(jLongValue2);
                            sbLIZ.append("");
                            arrayMap2.put("to_user_rank", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        arrayMap2.put("top_active_user_rank_message_type", str);
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                            ownerUserId = ((Room) dataChannelGlobal.gg0(C930940aKi.class)).getOwnerUserId();
                        } else {
                            ownerUserId = 0;
                        }
                        if (currentUserId != 0 && dataChannelGlobal.gg0(C930940aKi.class) != null) {
                            if (currentUserId == ownerUserId) {
                                arrayMap2.put("from_user_rank", "null");
                            } else if (((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(((C0IR5) dataChannelGlobal.gg0(C1148310fzJ.class)).LJFF.LJJIL);
                                sbLIZ2.append("");
                                arrayMap2.put("from_user_rank", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        }
                        userProfileEvent.setExtraParams(arrayMap2);
                    }
                }
            }

            {
                this.LLIZLLLIL = str;
                this.LLILLL = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
                this.LLIZ = runnable;
                this.LLJ = interfaceC1110040eza;
            }
        };
    }

    @Override // X.InterfaceC1133840fby
    public final C1110050ezb LJJJ(int i, User user) {
        return new C1110050ezb(user, i, LLD(), LLF(), LLILIL());
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a9, code lost:
    
        r6 = new java.util.ArrayList();
        r7 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b6, code lost:
    
        if (r7.hasNext() == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b8, code lost:
    
        r2 = r7.next();
        r1 = (com.bytedance.android.live.base.model.user.BadgeStruct) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01bf, code lost:
    
        if (r1 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c3, code lost:
    
        if (r1.display == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c7, code lost:
    
        if (r1.combineBadgeStruct == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cd, code lost:
    
        if (LLIIZ(r1, r14) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cf, code lost:
    
        r6.add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.live.base.model.user.BadgeStruct> LLI(com.bytedance.android.live.base.model.user.User r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1110790f0n.LLI(com.bytedance.android.live.base.model.user.User, boolean):java.util.List");
    }

    public final boolean LLIIZ(BadgeStruct badgeStruct, User user) {
        if (badgeStruct == null || user == null) {
            return false;
        }
        if ((((int) badgeStruct.greyedByClient) & 8) != 8) {
            return true;
        }
        if ((!LLIILII() && user.getId() != LLIIIILZ().LJ()) || !LiveShouldShowGrayBadgeTypes.INSTANCE.isShouldShowGrayBadgeType(badgeStruct.badgeScene)) {
            return false;
        }
        return true;
    }
}

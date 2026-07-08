package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.CallbackAction;
import com.ss.android.ugc.tools.data.ConfirmModal;
import com.ss.android.ugc.tools.data.RawIcon;
import com.ss.android.ugc.tools.data.TitleBarAppearance;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18WX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18WX extends AbstractC2255721DQs<InterfaceC1430910nL7> implements InterfaceC1430910nL7, InterfaceC379610EuV, InterfaceC21297218Wc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC21297318Wd LLILLJJLI;
    public final Context LLILLL;
    public final InterfaceC1430910nL7 LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final ConcurrentHashMap<Class<?>, Object> LLILZLL;
    public final ConcurrentHashMap<Class<?>, Object> LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18WX.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C18WX.class, "chatRoomComponentApi", "getChatRoomComponentApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomFeatureApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C18WX.class, "chatTitlebarApi", "getChatTitlebarApi()Lcom/ss/android/ugc/tools/chat/titlebar/api/AiChatTitleBarFeatureApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJIJIL = 8;
    }

    @Override // X.InterfaceC1430910nL7
    public InterfaceC21297218Wc NX() {
        return this;
    }

    private final AiChatRoomFeatureApi X1() {
        return (AiChatRoomFeatureApi) this.LLIZLLLIL.getValue(this, LLJI[1]);
    }

    private final C18UJ Z1() {
        return (C18UJ) this.LLILZIL.getValue(this, LLJI[0]);
    }

    private final C18WH o2() {
        return (C18WH) this.LLJ.getValue(this, LLJI[2]);
    }

    public InterfaceC1430910nL7 W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    public Context getContext() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final InterfaceC21297318Wd w2() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1430910nL7
    public <T> void Op0(Class<T> cls) {
        this.LLILZLL.remove(cls);
    }

    @Override // X.InterfaceC1430910nL7
    public <T> T as0(Class<T> cls) {
        return (T) this.LLILZLL.get(cls);
    }

    @Override // X.InterfaceC21297218Wc
    public <T> T getAbility(Class<T> cls) {
        return (T) this.LLIZ.get(cls);
    }

    @Override // X.InterfaceC1430910nL7
    public <T> void dn2(Class<T> cls, T t) {
        this.LLILZLL.put(cls, t);
    }

    public C18WX(C1DRG c1drg, InterfaceC21297318Wd interfaceC21297318Wd, Context context) {
        AIChatCallbacks aIChatCallbacks;
        AIChatAppearance aIChatAppearance;
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC21297318Wd;
        this.LLILLL = context;
        final CallbackAction callbackAction = null;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.LLILZLL = concurrentHashMap;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.LLIZ = concurrentHashMap2;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), AiChatRoomFeatureApi.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C18WH.class, null);
        AIChatPageConfig aIChatPageConfig = Z1().LJI;
        final TitleBarAppearance titleBarAppearance = (aIChatPageConfig == null || (aIChatAppearance = aIChatPageConfig.appearance) == null || (titleBarAppearance = aIChatAppearance.titleBar) == null) ? new TitleBarAppearance(2131825613, new RawIcon(R.raw.icon_bitmap_ai_imagine_light_fill, R.raw.icon_bitmap_ai_imagine_dark_fill), EnumC1783230wVN.BACK_ARROW, EnumC1783230wVN.NONE) : titleBarAppearance;
        concurrentHashMap.put(InterfaceC1409980mnM.class, new InterfaceC1409980mnM(titleBarAppearance) { // from class: X.18WY
            public final TitleBarAppearance LIZ;
            public final Uri LIZIZ = UriProtector.parse(C21288518St.LIZ().aiChatAvatar);

            {
                this.LIZ = titleBarAppearance;
            }

            @Override // X.InterfaceC1409980mnM
            public final void LIZIZ(ViewGroup viewGroup) {
                RawIcon rawIcon;
                String scheme;
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                int iIntValue4;
                Integer numValueOf;
                int iIntValue5;
                TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.y23);
                if (tuxTextView != null) {
                    TitleBarAppearance titleBarAppearance2 = this.LIZ;
                    if (titleBarAppearance2 != null) {
                        numValueOf = Integer.valueOf(titleBarAppearance2.titleResId);
                    } else {
                        numValueOf = null;
                    }
                    C21291618Ty c21291618Ty = EnumC21291418Tw.Companion;
                    if (numValueOf != null) {
                        iIntValue5 = numValueOf.intValue();
                    } else {
                        iIntValue5 = 2131825613;
                    }
                    c21291618Ty.getClass();
                    tuxTextView.setText(C21291518Tx.LJ(C21291618Ty.LIZ(iIntValue5), new Object[0]));
                }
                if (tuxTextView != null) {
                    int[] iArr = new int[4];
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cl, tuxTextView.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iArr[0] = iIntValue;
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ce, tuxTextView.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    iArr[1] = iIntValue2;
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, tuxTextView.getContext());
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    iArr[2] = iIntValue3;
                    Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.cc, tuxTextView.getContext());
                    if (numLIZJ4 != null) {
                        iIntValue4 = numLIZJ4.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    iArr[3] = iIntValue4;
                    C432070Gwv.LIZIZ(tuxTextView, iArr, new float[]{0.0f, 0.25f, 0.5f, 1.0f});
                }
                C1322110kVd c1322110kVd = (C1322110kVd) viewGroup.findViewById(R.id.y07);
                if (c1322110kVd != null) {
                    if (!Intrinsics.LJFF(this.LIZIZ, Uri.EMPTY) && (scheme = this.LIZIZ.getScheme()) != null && scheme.length() > 0) {
                        c1322110kVd.setImageURI(this.LIZIZ);
                        return;
                    }
                    TitleBarAppearance titleBarAppearance3 = this.LIZ;
                    if (titleBarAppearance3 == null || (rawIcon = titleBarAppearance3.icon) == null) {
                        rawIcon = new RawIcon(R.raw.icon_bitmap_ai_imagine_light_fill, R.raw.icon_bitmap_ai_imagine_dark_fill);
                    }
                    c1322110kVd.getContext();
                    int i = rawIcon.dark;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = i;
                    c1322110kVd.setImageDrawable(c419910GdJ.LIZ(c1322110kVd.getContext()));
                }
            }

            @Override // X.InterfaceC1409980mnM
            public final void LIZ(InterfaceC21297218Wc interfaceC21297218Wc, ViewGroup viewGroup) {
                EnumC1783230wVN enumC1783230wVN;
                TitleBarAppearance titleBarAppearance2 = this.LIZ;
                if (titleBarAppearance2 != null) {
                    enumC1783230wVN = titleBarAppearance2.rightButton;
                } else {
                    enumC1783230wVN = null;
                }
                if (((InterfaceC21297318Wd) interfaceC21297218Wc.getAbility(InterfaceC21297318Wd.class)).LLIIIL()) {
                    enumC1783230wVN = EnumC1783230wVN.NONE;
                }
                TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.p22);
                if (tuxIconView != null) {
                    LIZLLL(interfaceC21297218Wc, enumC1783230wVN, viewGroup, tuxIconView);
                }
            }

            @Override // X.InterfaceC1409980mnM
            public final void LIZJ(InterfaceC21297218Wc interfaceC21297218Wc, ViewGroup viewGroup) {
                EnumC1783230wVN enumC1783230wVN;
                TitleBarAppearance titleBarAppearance2 = this.LIZ;
                if (titleBarAppearance2 != null) {
                    enumC1783230wVN = titleBarAppearance2.leftButton;
                } else {
                    enumC1783230wVN = null;
                }
                if (((InterfaceC21297318Wd) interfaceC21297218Wc.getAbility(InterfaceC21297318Wd.class)).LLIIIL()) {
                    enumC1783230wVN = EnumC1783230wVN.BACK_ARROW;
                }
                TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.p20);
                if (tuxIconView != null) {
                    LIZLLL(interfaceC21297218Wc, enumC1783230wVN, viewGroup, tuxIconView);
                }
            }

            public static void LIZLLL(InterfaceC21297218Wc interfaceC21297218Wc, EnumC1783230wVN enumC1783230wVN, ViewGroup viewGroup, TuxIconView tuxIconView) {
                int i;
                if (enumC1783230wVN != null && (i = C1783240wVO.LIZ[enumC1783230wVN.ordinal()]) != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new C1954807lC();
                                }
                            } else {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_arrow_up_right_and_arrow_down_left;
                                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                                tuxIconView.setImageDrawable(c419910GdJ.LIZ(tuxIconView.getContext()));
                                C786410Ut5.K7(viewGroup, new ACListenerS166S0100000_32(interfaceC21297218Wc, 45));
                                return;
                            }
                        } else {
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZ = R.raw.icon_x_mark;
                            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                            tuxIconView.setImageDrawable(c419910GdJ2.LIZ(tuxIconView.getContext()));
                            C786410Ut5.K7(viewGroup, new ACListenerS166S0100000_32(interfaceC21297218Wc, 44));
                            return;
                        }
                    } else {
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = R.raw.icon_chevron_left_offset_ltr;
                        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1h);
                        tuxIconView.setImageDrawable(c419910GdJ3.LIZ(tuxIconView.getContext()));
                        C786410Ut5.K7(viewGroup, new ACListenerS166S0100000_32(interfaceC21297218Wc, 43));
                        return;
                    }
                }
                C786410Ut5.LJLZ(8, viewGroup);
            }
        });
        AIChatPageConfig aIChatPageConfig2 = Z1().LJI;
        AIChatPageConfig aIChatPageConfig3 = Z1().LJI;
        if (aIChatPageConfig3 != null && (aIChatCallbacks = aIChatPageConfig3.callbacks) != null) {
            callbackAction = aIChatCallbacks.onPostAction;
        }
        concurrentHashMap.put(C18WU.class, new C18WU(callbackAction) { // from class: X.18Wa
            public final CallbackAction LIZ;

            @Override // X.C18WU
            public final boolean LIZIZ() {
                return this.LIZ != null;
            }

            @Override // X.C18WU
            public final ConfirmModal LIZJ() {
                CallbackAction callbackAction2 = this.LIZ;
                if (callbackAction2 != null) {
                    return callbackAction2.callbackConfirmModal;
                }
                return null;
            }

            @Override // X.C18WU
            public final boolean LIZLLL() {
                CallbackAction callbackAction2 = this.LIZ;
                return (callbackAction2 == null || callbackAction2.callbackConfirmModal == null) ? false : true;
            }

            {
                this.LIZ = callbackAction;
            }

            @Override // X.C18WU
            public final void LIZ(InterfaceC21297218Wc interfaceC21297218Wc, AIChatGenNode aIChatGenNode) {
                CallbackAction callbackAction2 = this.LIZ;
                if (callbackAction2 != null && callbackAction2.actionType == EnumC1778710wO5.ACTIVITY_CALLBACK) {
                    ((InterfaceC21297418We) interfaceC21297218Wc.getAbility(InterfaceC21297418We.class)).M7(this.LIZ.callbackID, aIChatGenNode, true);
                }
            }
        });
        concurrentHashMap2.put(InterfaceC21297318Wd.class, interfaceC21297318Wd);
        concurrentHashMap2.put(InterfaceC21297418We.class, X1());
        concurrentHashMap2.put(InterfaceC21297618Wg.class, o2());
    }
}

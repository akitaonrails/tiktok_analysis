package X;

import android.graphics.Typeface;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.handler.TakoDataCollectionTagHandler;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixPicItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.performance.mob.experiment.TakoFluencyOptExp;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS95S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859250yTz {
    public static final int LIZ = LJIILIIL(111);
    public static final int LIZIZ = LJIILIIL(13);
    public static final int LIZJ = LJIILIIL(23);
    public static final int LIZLLL = LJIILIIL(33);
    public static final int LJ = LJIILIIL(103);
    public static final Typeface LJFF;
    public static final Typeface LJI;
    public static final Typeface LJII;
    public static final int LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;
    public static final Regex LJIILIIL;
    public static final Regex LJIILJJIL;
    public static final Regex LJIILL;
    public static final Regex LJIILLIIL;
    public static final C01GW LJIIZILJ;
    public static final C01GW LJIJ;
    public static final C01GW LJIJI;
    public static final Set<InterfaceC1859220yTw> LJIJJ;
    public static final Set<String> LJIJJLI;
    public static final Set<String> LJIL;

    static {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(13);
        LJFF = c444890HcV.getTypeface();
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(11);
        LJI = c444890HcV2.getTypeface();
        C444890HcV c444890HcV3 = new C444890HcV();
        c444890HcV3.LIZ(12);
        LJII = c444890HcV3.getTypeface();
        LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        LJIIIZ = true;
        LJIIJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(245));
        LJIIJJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(246));
        LJIIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(243));
        LJIILIIL = new Regex("<data-inline\\s+([^>]*?)\\s*(?:\\/>|>(.*?)<\\/data-inline>)");
        LJIILJJIL = new Regex("value=\"(\\{.*?\\})\"");
        LJIILL = new Regex("type=\".*?\"");
        LJIILLIIL = new Regex("type=\"(.*?)\"");
        LJIIZILJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(244));
        LJIJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(247));
        LJIJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(782));
        Set<InterfaceC1859220yTw> setLJLIIL = C13LQ.LJLIIL(new InterfaceC1859220yTw[]{new C1859040yTe(), new InterfaceC1859220yTw() { // from class: X.0yTq
            public final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"image-three", "image-groups", "image-one-square", "image-one-rectangle-horizontal", "image-one-rectangle-vertical", "image-one-brand", "image-one-pull", "image-two"});
            public final C08CX LIZIZ = C08CX.INSTANCE;

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                boolean z;
                List<TakoMixPicItem> list;
                BaseImage baseImageLIZLLL;
                Integer num;
                if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (list = takoPlaceholderSource.picList) == null || list.isEmpty()) {
                    return null;
                }
                int i = C1726950v2b.LIZ;
                List list2 = takoPlaceholderSource.picList;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                int size = list2.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return "image-groups";
                        }
                        return "image-three";
                    }
                    return "image-two";
                }
                if (((TakoMixPicItem) ListProtector.get(list2, 0)).type == 4) {
                    return "image-one-brand";
                }
                if (((TakoMixPicItem) ListProtector.get(list2, 0)).type == 5) {
                    return "image-one-pull";
                }
                TakoMixPicItem takoMixPicItem = (TakoMixPicItem) C13LP.LJJJLL(list2);
                if (takoMixPicItem != null && (baseImageLIZLLL = AnonymousClass1418.LIZLLL(takoMixPicItem)) != null) {
                    Size size2 = new Size(baseImageLIZLLL.width, baseImageLIZLLL.height);
                    if (size2.getWidth() != size2.getHeight()) {
                        if (size2.getWidth() > size2.getHeight()) {
                            return "image-one-rectangle-horizontal";
                        }
                        return "image-one-rectangle-vertical";
                    }
                    return "image-one-square";
                }
                return "image-one-square";
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return new AwS431S0200000_30(this, interfaceC1587906Jp, 36);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iLIZ = C0H16.LIZ(spanned, spanned.getSpanStart(interfaceC1859630yUb));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                String dataType = interfaceC1859630yUb.getDataType();
                switch (dataType.hashCode()) {
                    case -1958608773:
                        if (!dataType.equals("image-one-rectangle-horizontal")) {
                            return null;
                        }
                        break;
                    case -1020891514:
                        if (!dataType.equals("image-groups")) {
                            return null;
                        }
                        int iLIZ2 = C1726950v2b.LIZ(iLIZ, view);
                        int i = C1726950v2b.LIZ;
                        return new Size(iLIZ2, (((iLIZ2 - (i * 2)) * 2) / 3) + iLIZIZ + i);
                    case -879314214:
                        if (!dataType.equals("image-two")) {
                            return null;
                        }
                        int iLIZ3 = C1726950v2b.LIZ(iLIZ, view);
                        int i2 = (iLIZ3 - (C1726950v2b.LIZ * 2)) / 2;
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152));
                        if (i2 > iLIZIZ2) {
                            i2 = iLIZIZ2;
                        }
                        return new Size(iLIZ3, i2 + iLIZIZ);
                    case -374447746:
                        if (!dataType.equals("image-one-pull")) {
                            return null;
                        }
                        return new Size(C1726950v2b.LIZ(iLIZ, view), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)) + iLIZIZ);
                    case 314049933:
                        if (!dataType.equals("image-one-rectangle-vertical")) {
                            return null;
                        }
                        return new Size(C1726950v2b.LIZ(iLIZ, view), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203)) + iLIZIZ);
                    case 1015423510:
                        if (!dataType.equals("image-one-square")) {
                            return null;
                        }
                        break;
                    case 1087156908:
                        if (!dataType.equals("image-three")) {
                            return null;
                        }
                        int iLIZ4 = C1726950v2b.LIZ(iLIZ, view);
                        int i3 = C1726950v2b.LIZ;
                        return new Size(iLIZ4, ((iLIZ4 - (i3 * 2)) / 3) + iLIZIZ + i3);
                    case 1263992686:
                        if (!dataType.equals("image-one-brand")) {
                            return null;
                        }
                        return new Size(C1726950v2b.LIZ(iLIZ, view), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(294)) + iLIZIZ);
                    default:
                        return null;
                }
                return new Size(C1726950v2b.LIZ(iLIZ, view), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)) + iLIZIZ);
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                List<TakoMixPicItem> list;
                Size size;
                Size size2;
                BaseImage baseImageLIZLLL;
                if (takoPlaceholderSource == null || (list = takoPlaceholderSource.picList) == null) {
                    return null;
                }
                int i2 = C1726950v2b.LIZ;
                int size3 = list.size();
                if (size3 != 1) {
                    if (size3 != 2) {
                        if (view != null) {
                            int iLIZ = (C1726950v2b.LIZ(i, view) - (C1726950v2b.LIZ * 2)) / 3;
                            size2 = new Size(iLIZ, iLIZ);
                        } else {
                            size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                        }
                    } else if (view != null) {
                        int iLIZ2 = (C1726950v2b.LIZ(i, view) - (C1726950v2b.LIZ * 2)) / 2;
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152));
                        if (iLIZ2 > iLIZIZ) {
                            iLIZ2 = iLIZIZ;
                        }
                        size2 = new Size(iLIZ2, iLIZ2);
                    } else {
                        size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                    }
                } else if (((TakoMixPicItem) ListProtector.get(list, 0)).type == 4) {
                    size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(294)));
                } else if (((TakoMixPicItem) ListProtector.get(list, 0)).type == 5) {
                    size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(195)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)));
                } else {
                    TakoMixPicItem takoMixPicItem = (TakoMixPicItem) C13LP.LJJJLL(list);
                    if (takoMixPicItem != null && (baseImageLIZLLL = AnonymousClass1418.LIZLLL(takoMixPicItem)) != null) {
                        size = new Size(baseImageLIZLLL.width, baseImageLIZLLL.height);
                    } else {
                        size = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                    }
                    if (size.getWidth() == size.getHeight()) {
                        size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                    } else if (size.getWidth() > size.getHeight()) {
                        size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                    } else {
                        size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(203)));
                    }
                }
                return new C1859180yTs(list, size2, i);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTV
            public final Set<String> LIZ = Collections.singleton("image-gen");
            public final Set<String> LIZIZ = Collections.singleton("image-gen");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                Integer num;
                List<TakoMixPicItem> list;
                if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 7 && (list = takoPlaceholderSource.picList) != null && !list.isEmpty()) {
                    return "image-gen";
                }
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return AFwS216S0000000_27.get$arr$(265);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iIntValue;
                Double dLJII;
                int iLIZ = C1859020yTc.LIZ(z, false);
                String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), "widgetH");
                if (strLJII != null && (dLJII = C2327809Ae.LJII(strLJII)) != null) {
                    iIntValue = (int) dLJII.doubleValue();
                } else {
                    iIntValue = ((Number) C306850C1b.LIZ(0.5625f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(173)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(128)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))).getSecond()).intValue();
                }
                return new Size(iLIZ, iIntValue);
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                List<TakoMixPicItem> list;
                float f;
                int i2;
                Message messageYy1 = null;
                if (takoPlaceholderSource == null || (list = takoPlaceholderSource.picList) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (TakoMixPicItem takoMixPicItem : list) {
                    if (AnonymousClass1418.LIZLLL(takoMixPicItem) != null) {
                        arrayList.add(takoMixPicItem);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    BaseImage baseImageLIZLLL = AnonymousClass1418.LIZLLL((TakoMixPicItem) it2.next());
                    if (baseImageLIZLLL != null) {
                        arrayList2.add(baseImageLIZLLL);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                if (takoCardAbility != null) {
                    messageYy1 = takoCardAbility.Yy1();
                }
                BaseImage baseImage = (BaseImage) C13LP.LJJJLL(arrayList2);
                if (baseImage != null && (i2 = baseImage.height) > 0) {
                    f = baseImage.width / i2;
                } else {
                    f = 0.5625f;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ImageAction imageAction = ((TakoMixPicItem) it3.next()).imageAction;
                    if (imageAction != null) {
                        arrayList3.add(imageAction);
                    }
                }
                return new C1856780yQ0(messageYy1, arrayList2, f, arrayList3);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTY
            public final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"user", "user-group"});
            public final Set<String> LIZIZ = Collections.singleton("user-group");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                Integer num;
                List<TakoUserItem> list;
                if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 1 && (list = takoPlaceholderSource.userList) != null && !list.isEmpty()) {
                    List<TakoUserItem> list2 = takoPlaceholderSource.userList;
                    if (list2 != null && list2.size() == 1) {
                        return "user";
                    }
                    return "user-group";
                }
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                if (!(interfaceC1587906Jp instanceof InterfaceC689340R2e) && !(interfaceC1587906Jp instanceof InterfaceC689370R2h)) {
                    if (interfaceC1587906Jp instanceof InterfaceC1857890yRn) {
                        return AFwS216S0000000_27.get$arr$(268);
                    }
                    return null;
                }
                return AFwS216S0000000_27.get$arr$(269);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iLIZ = C0H16.LIZ(spanned, spanned.getSpanStart(interfaceC1859630yUb));
                C07QJ.LIZ.getClass();
                boolean zLIZIZ = C07QJ.LIZIZ();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                if (Intrinsics.LJFF(interfaceC1859630yUb.getDataType(), "user")) {
                    if (spanned.getSpanStart(interfaceC1859630yUb) == 0) {
                        return new Size((C1859020yTc.LIZ(z, zLIZIZ) - iLIZ) - (C1859250yTz.LJI() * 2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
                    }
                    return new Size((C1859020yTc.LIZ(z, false) - iLIZ) - (C1859250yTz.LJI() * 2), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)) + iLIZIZ);
                }
                if (Intrinsics.LJFF(interfaceC1859630yUb.getDataType(), "user-group")) {
                    return new Size(C1859020yTc.LIZ(z, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) + iLIZIZ);
                }
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                List<TakoUserItem> list;
                String str2;
                Message messageYy1;
                if (takoPlaceholderSource != null && (list = takoPlaceholderSource.userList) != null) {
                    if (list.size() == 1) {
                        TakoUserItem takoUserItem = (TakoUserItem) C13LP.LJJJLL(list);
                        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str2 = messageYy1.msgId) == null) {
                            str2 = "";
                        }
                        if (C07I4.LIZ()) {
                            return new C1859000yTa(takoUserItem, str2);
                        }
                        return new C1858990yTZ(takoUserItem, str2);
                    }
                    if (list.size() > 1) {
                        return new C1858580ySu(takoCardAbility, list, i);
                    }
                    return null;
                }
                return null;
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTU
            public final Set<String> LIZ = Collections.singleton("goods");
            public final Set<String> LIZIZ = Collections.singleton("goods");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                Integer num;
                List<TakoProductItem> list;
                if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 2 && (list = takoPlaceholderSource.goodList) != null && !list.isEmpty()) {
                    return "goods";
                }
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return AFwS216S0000000_27.get$arr$(264);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                return new Size(C1859020yTc.LIZ(z, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(258)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                List<TakoProductItem> list;
                Message messageYy1;
                TakoMixFeed takoMixFeedLJIIIZ = null;
                if (takoPlaceholderSource == null || (list = takoPlaceholderSource.goodList) == null) {
                    return null;
                }
                if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
                    takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
                }
                return new C1858930yTT(list, takoMixFeedLJIIIZ, i);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTl
            public final Set<String> LIZ = Collections.singleton("sug");
            public final Set<String> LIZIZ = Collections.singleton("sug");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                Integer num;
                List<TakoSug> list;
                if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 4 && (list = takoPlaceholderSource.sugs) != null && !list.isEmpty()) {
                    return "sug";
                }
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return AFwS216S0000000_27.get$arr$(267);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iDoubleValue;
                Double dLJII;
                String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), "widgetH");
                if (strLJII != null && (dLJII = C2327809Ae.LJII(strLJII)) != null) {
                    iDoubleValue = (int) dLJII.doubleValue();
                } else {
                    iDoubleValue = 0;
                }
                return new Size(C1859020yTc.LIZ(z, false), iDoubleValue + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                TakoSug takoSug;
                List<TakoSug> list;
                if (takoPlaceholderSource != null && (list = takoPlaceholderSource.sugs) != null) {
                    takoSug = (TakoSug) C13LP.LJJJLZIJ(0, list);
                } else {
                    takoSug = null;
                }
                return new C1859120yTm(takoSug, takoCardAbility, str);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTk
            public final Set<String> LIZ = Collections.singleton("lynx");
            public final Set<String> LIZIZ = Collections.singleton("lynx");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                boolean z;
                String str;
                TakoAnyCard takoAnyCard;
                Integer num;
                Integer num2;
                if (takoPlaceholderSource != null && (num2 = takoPlaceholderSource.sourceType) != null && num2.intValue() == 100) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                TakoAnyCard takoAnyCard2 = takoPlaceholderSource.anyCard;
                if (takoAnyCard2 != null) {
                    str = takoAnyCard2.rawData;
                } else {
                    str = null;
                }
                if (!C123100dR.LIZ(str) || (takoAnyCard = takoPlaceholderSource.anyCard) == null || (num = takoAnyCard.category) == null || num.intValue() != 1) {
                    return null;
                }
                return "lynx";
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return AFwS216S0000000_27.get$arr$(266);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iDoubleValue;
                Double dLJII;
                String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), "widgetH");
                if (strLJII != null && (dLJII = C2327809Ae.LJII(strLJII)) != null) {
                    iDoubleValue = (int) dLJII.doubleValue();
                } else {
                    iDoubleValue = 0;
                }
                return new Size(C1859020yTc.LIZ(z, false), iDoubleValue + C1859190yTt.LLJILJIL);
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                TakoAnyCard takoAnyCard;
                if (takoPlaceholderSource != null) {
                    takoAnyCard = takoPlaceholderSource.anyCard;
                } else {
                    takoAnyCard = null;
                }
                return new C1858860yTM(takoAnyCard, takoCardAbility, takoPlaceholderSource);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTj
            public final Set<String> LIZ = Collections.singleton("nimble");
            public final Set<String> LIZIZ = Collections.singleton("nimble");

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                boolean z;
                String str;
                TakoAnyCard takoAnyCard;
                Integer num;
                Integer num2;
                if (takoPlaceholderSource != null && (num2 = takoPlaceholderSource.sourceType) != null && num2.intValue() == 100) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return null;
                }
                TakoAnyCard takoAnyCard2 = takoPlaceholderSource.anyCard;
                if (takoAnyCard2 != null) {
                    str = takoAnyCard2.rawData;
                } else {
                    str = null;
                }
                if (!C123100dR.LIZ(str) || (takoAnyCard = takoPlaceholderSource.anyCard) == null || (num = takoAnyCard.category) == null || num.intValue() != 2) {
                    return null;
                }
                return "nimble";
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                String strLIZ;
                C0R2N c0r2n;
                if (!(interfaceC1587906Jp instanceof C0R2N) || (c0r2n = (C0R2N) interfaceC1587906Jp) == null || (strLIZ = c0r2n.LIZ()) == null) {
                    strLIZ = "";
                }
                return new AwS95S1000000_10(strLIZ, 8);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                int iDoubleValue;
                Double dLJII;
                String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), "widgetH");
                if (strLJII != null && (dLJII = C2327809Ae.LJII(strLJII)) != null) {
                    iDoubleValue = (int) dLJII.doubleValue();
                } else {
                    iDoubleValue = 0;
                }
                return new Size(C1859020yTc.LIZ(z, false), iDoubleValue + C1859190yTt.LLJILJIL);
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                TakoAnyCard takoAnyCard;
                if (takoPlaceholderSource != null) {
                    takoAnyCard = takoPlaceholderSource.anyCard;
                } else {
                    takoAnyCard = null;
                }
                return new C1859080yTi(takoAnyCard);
            }
        }, new InterfaceC1859220yTw() { // from class: X.0yTW
            public final Set<String> LIZ = Collections.singleton("create_button");
            public final Set<String> LIZIZ = Collections.singleton("create_button");

            @Override // X.InterfaceC1859220yTw
            public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
                return null;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Set<String> LIZIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1859220yTw
            public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
                return AFwS216S0000000_27.get$arr$(263);
            }

            @Override // X.InterfaceC1859220yTw
            public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
                return new Size(C1859020yTc.LIZ(z, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            }

            @Override // X.InterfaceC1859220yTw
            public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
                if (takoPlaceholderSource != null) {
                    takoPlaceholderSource.LIZ = c689590R3d;
                }
            }

            @Override // X.InterfaceC1859220yTw
            public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
                return new C1858970yTX();
            }
        }});
        LJIJJ = setLJLIIL;
        Set setLJLIIL2 = C13LQ.LJLIIL(new String[]{"uncertain", "video"});
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setLJLIIL.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((InterfaceC1859220yTw) it2.next()).LIZ(), arrayList);
        }
        LJIJJLI = C15442062u.LJIIIZ(setLJLIIL2, C13LP.LLIIJI(arrayList));
        Set<InterfaceC1859220yTw> set = LJIJJ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = set.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((InterfaceC1859220yTw) it3.next()).LIZIZ(), arrayList2);
        }
        LJIL = C13LP.LLIIJI(arrayList2);
    }

    public static final int LJI() {
        return ((Number) LJIJI.getValue()).intValue();
    }

    public static final int LJFF() {
        return C07ID.LIZ() ? C11VU.LJ(C1857750yRZ.LIZ) : C11VU.LJ(C1857750yRZ.LIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    }

    public static C0HXO LIZJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return new C0HXO(interfaceC665370Q7z, "reply");
    }

    public static final InterfaceC1859220yTw LJ(String str) {
        Object next;
        Iterator<T> it2 = LJIJJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1859220yTw) next).LIZ().contains(str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (InterfaceC1859220yTw) next;
    }

    public static final String LJIIJ(String str) {
        if (!((TakoFluencyOptExp.TakoFluencyOptConfig) TakoFluencyOptExp.LIZIZ.getValue()).enableHtmlEscapeOpt) {
            return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "&", "&amp;", false), "\"", "&quot;", false), "<", "&lt;", false), ">", "&gt;", false), "'", "&#39;", false);
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"' || cCharAt == '<' || cCharAt == '>' || cCharAt == '&' || cCharAt == '\'') {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int length2 = str.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 != '\"') {
                        if (cCharAt2 != '<') {
                            if (cCharAt2 != '>') {
                                if (cCharAt2 != '&') {
                                    if (cCharAt2 != '\'') {
                                        sb.append(cCharAt2);
                                    } else {
                                        sb.append("&#39;");
                                    }
                                } else {
                                    sb.append("&amp;");
                                }
                            } else {
                                sb.append("&gt;");
                            }
                        } else {
                            sb.append("&lt;");
                        }
                    } else {
                        sb.append("&quot;");
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static final String LJIIJJI(String str) {
        int i = 0;
        if (!((TakoFluencyOptExp.TakoFluencyOptConfig) TakoFluencyOptExp.LIZIZ.getValue()).enableHtmlEscapeOpt) {
            return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "&quot;", "\"", false), "&lt;", "<", false), "&gt;", ">", false), "&amp;", "&", false), "&#39;", "'", false);
        }
        if (a0.LJJIZ(str, '&', 0, false, 6) == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                if (str.startsWith("&quot;", i)) {
                    sb.append('\"');
                    i += 6;
                } else {
                    if (str.startsWith("&lt;", i)) {
                        sb.append('<');
                    } else if (str.startsWith("&gt;", i)) {
                        sb.append('>');
                    } else {
                        if (str.startsWith("&#39;", i)) {
                            sb.append('\'');
                        } else if (str.startsWith("&amp;", i)) {
                            sb.append('&');
                        } else {
                            sb.append(cCharAt);
                        }
                        i += 5;
                    }
                    i += 4;
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }

    public static final int LJIILIIL(int i) {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(i);
        return (int) C445120Hcs.LIZJ(Float.valueOf(c444890HcV.getTextSize()));
    }

    public static final C21419418s4 LIZ(C1860130yVP c1860130yVP, InterfaceC665370Q7z interfaceC665370Q7z) {
        Message messageYy1;
        boolean z;
        boolean z2;
        int iLIZIZ;
        TakoMixFeed takoMixFeedLJIIIZ;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        InterfaceC434180H0u interfaceC434180H0uNO = null;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (takoCardAbility != null) {
            messageYy1 = takoCardAbility.Yy1();
        } else {
            messageYy1 = null;
        }
        if (takoChatUIAbility != null && takoChatUIAbility.Gx1()) {
            z = true;
        } else {
            z = false;
        }
        if (iTakoContextAbility != null && iTakoContextAbility.T91()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (takoChatUIAbility != null) {
            iLIZIZ = takoChatUIAbility.FM2();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        if (messageYy1 != null) {
            takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
        } else {
            takoMixFeedLJIIIZ = null;
        }
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            str = c1863850ybP.LLILZIL;
        } else {
            str = null;
        }
        if (takoCardAbility != null) {
            interfaceC434180H0uNO = takoCardAbility.nO();
        }
        return LIZIZ(c1860130yVP, z2, z, iLIZIZ, messageYy1, takoMixFeedLJIIIZ, str, interfaceC434180H0uNO, new AwS571S0100000_27(takoCardAbility, 1105), new AwS571S0100000_27(takoCardAbility, 1106), false);
    }

    public static final List LIZLLL(C1859750yUn c1859750yUn, String str) {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(new C437100HCa(c1859750yUn.getContext(), null, str, c1859750yUn, C1308910kAL.LIZJ(R.attr.a0g, c1859750yUn.getContext()), 0, false));
        c13dvLIZIZ.add(new C0HCU(c1859750yUn));
        c13dvLIZIZ.add(new C21417018rg(c1859750yUn.getContext(), AFwS216S0000000_27.get$arr$(248), AFwS216S0000000_27.get$arr$(249), null));
        C07QH.LIZ.getClass();
        if (C07QH.LIZ()) {
            c13dvLIZIZ.add(new TakoDataCollectionTagHandler(c1859750yUn, null));
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public static final String LJII(String str, String str2) {
        Map map;
        try {
            if (((TakoFluencyOptExp.TakoFluencyOptConfig) TakoFluencyOptExp.LIZIZ.getValue()).enableGsonOpt) {
                map = (Map) GsonProtectorUtils.fromJson((Gson) LJIIZILJ.getValue(), LJIIJJI(str), Map.class);
            } else {
                map = (Map) GsonProtectorUtils.fromJson(new Gson(), LJIIJJI(str), Map.class);
            }
            Object obj = map.get(str2);
            if (obj != null) {
                String string = obj.toString();
                if (string == null) {
                    return "";
                }
                return string;
            }
            return "";
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LJIIL(String str, Map map) {
        TakoPlaceholderSource takoPlaceholderSource;
        Object next;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (MatchResult matchResult : Regex.findAll$default(LJIILIIL, str, 0, 2, null)) {
            MatchResult matchResultFind$default = Regex.find$default(LJIILJJIL, matchResult.getValue(), i, 2, null);
            if (matchResultFind$default != null) {
                final String strLJII = LJII((String) ListProtector.get(matchResultFind$default.LIZ(), 1), FollowStatusChangeMethod.PARAM_UID);
                if (map != null) {
                    takoPlaceholderSource = (TakoPlaceholderSource) map.get(strLJII);
                } else {
                    takoPlaceholderSource = null;
                }
                Iterator<T> it2 = LJIJJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((InterfaceC1859220yTw) next).LJFF(takoPlaceholderSource) != null) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC1859220yTw interfaceC1859220yTw = (InterfaceC1859220yTw) next;
                if (interfaceC1859220yTw instanceof C1859040yTe) {
                    final int i2 = matchResult.LIZIZ().LL;
                    CharSequence charSequenceSubSequence = str.subSequence(i, i2);
                    final int i3 = 0;
                    for (int i4 = 0; i4 < charSequenceSubSequence.length(); i4++) {
                        if (charSequenceSubSequence.charAt(i4) == '\n') {
                            i3++;
                        }
                    }
                    final String strLJFF = ((C1859040yTe) interfaceC1859220yTw).LJFF(takoPlaceholderSource);
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    arrayList.add(new Object(i2, i3, strLJFF, strLJII) { // from class: X.002f
                        public final int LIZ;
                        public final int LIZIZ;
                        public final String LIZJ;
                        public final String LIZLLL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0139002f)) {
                                return false;
                            }
                            C0139002f c0139002f = (C0139002f) obj;
                            return this.LIZ == c0139002f.LIZ && this.LIZIZ == c0139002f.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0139002f.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0139002f.LIZLLL);
                        }

                        public final int hashCode() {
                            int iHashCode = ((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
                            String str2 = this.LIZLLL;
                            return iHashCode + (str2 == null ? 0 : str2.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("VideoWidgetOffsetInfo(charOffset=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", lineOffset=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(", type=");
                            sbLIZ.append(this.LIZJ);
                            sbLIZ.append(", placeholderId=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = i2;
                            this.LIZIZ = i3;
                            this.LIZJ = strLJFF;
                            this.LIZLLL = strLJII;
                        }
                    });
                }
            }
            i = 0;
        }
    }

    public static final String LJIIIIZZ(Message message, String str, Map<String, TakoPlaceholderSource> map, Boolean bool, String str2, boolean z, Integer num, Integer num2) {
        String strReplace = LJIILIIL.replace(str, new C1859230yTx(map, new C1859060yTg(), message, str, z, num, num2, bool, str2));
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZIZ()) {
            return u.LJJIFFI(strReplace, "data-inline", "data-inline-force-zero-left", false);
        }
        return strReplace;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C21419418s4 LIZIZ(X.C1860130yVP r92, boolean r93, boolean r94, int r95, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r96, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r97, java.lang.String r98, X.InterfaceC434180H0u r99, kotlin.jvm.functions.Function0<kotlin.Unit> r100, kotlin.jvm.functions.Function0<kotlin.Unit> r101, boolean r102) {
        /*
            Method dump skipped, instruction units count: 2003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859250yTz.LIZIZ(X.0yVP, boolean, boolean, int, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed, java.lang.String, X.0H0u, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean):X.18s4");
    }
}

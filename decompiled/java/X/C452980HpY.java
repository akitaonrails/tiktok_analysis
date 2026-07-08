package X;

import Y.ACListenerS110S0200000_6;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.feature.suggestedstickers.TypingRecommendationStickerDataVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IMEditTextAbility;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0HpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452980HpY extends AbstractC1700006lC<C452950HpV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final Set<EnumC1596306Mv> LLIZLLLIL;
    public final boolean LLJ;
    public final EnumC454490Hrz LLJI;
    public C452950HpV LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public final Set<String> LLJILLL;
    public boolean LLJJ;
    public final C054G LLJJI;
    public AnonymousClass0956 LLJJIII;
    public AnonymousClass0956 LLJJIJI;
    public C0P0T LLJJIJIIJIL;
    public volatile C09U0 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C452980HpY.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(C452980HpY.class, "vm", "<v#0>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C452980HpY.class, "stickerDataVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(C452980HpY.class, "vm", "<v#2>", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217401BqU, c2217401BqU2, c2217401BqU3};
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    public final void LJIIZILJ() {
        C06OT.LIZ++;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLJILLL, ",", null, null, 0, null, null, 62);
        InterfaceC453050Hpf value = this.LLILZIL.LJIIJ.getValue();
        if (value != null) {
            String str = this.LLJILJIL;
            boolean z = this.LLJJ;
            String str2 = this.LLJILJILJ;
            C452950HpV c452950HpV = this.LLJIJIL;
            value.ZG1(strLJJLIIIJ, str, str2, c452950HpV != null ? c452950HpV.LJII : null, z);
        }
        InterfaceC452460Hoi value2 = this.LLILZIL.LJIIJJI.getValue();
        if (value2 != null) {
            value2.LJIIIZ(strLJJLIIIJ);
        }
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1700006lC
    public final boolean LJIILIIL() {
        return this.LLJ;
    }

    public C452980HpY(C1600706On c1600706On) {
        super(c1600706On);
        this.LLIZLLLIL = Collections.singleton(EnumC1596306Mv.TYPING_RECOMMENDATION);
        this.LLJ = C06RM.LIZ();
        this.LLJI = EnumC454490Hrz.KEYWORD_SUGGESTION;
        this.LLJILLL = new LinkedHashSet();
        C09U0 c09u0 = this.LLJJIJIL;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLJJIJIL;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    this.LLJJIJIL = c09u0;
                }
            }
        }
        this.LLJJI = C2296808zG.LIZ(c09u0.LIZJ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 20)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[PHI: r3
      0x002f: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:18:0x002d, B:16:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[PHI: r3
      0x0052: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:18:0x002d, B:20:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C06OO r7) {
        /*
            r6 = this;
            X.0P0T r0 = r6.LLJJIJIIJIL
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            r5 = 0
            r6.LLJJIJIIJIL = r5
            X.0956 r0 = r6.LLJJIJI
            if (r0 == 0) goto L11
            r0.LIZIZ(r5)
        L11:
            X.0956 r0 = r6.LLJJIII
            if (r0 == 0) goto L18
            r0.LIZIZ(r5)
        L18:
            X.0HqQ r0 = com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics r4 = X.C453520HqQ.LIZ()
            if (r4 == 0) goto L85
            X.0HpV r0 = r6.LLJIJIL
            if (r0 == 0) goto L2b
            java.lang.String r3 = r0.LJFF
            if (r3 != 0) goto L2f
        L2b:
            java.lang.String r3 = ""
            if (r0 == 0) goto L52
        L2f:
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r0.LIZJ
            if (r0 == 0) goto L52
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.common.model.StickerItem r0 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r0
            java.lang.String r0 = X.C453550HqT.LIZJ(r0)
            if (r0 == 0) goto L3c
            r2.add(r0)
            goto L3c
        L52:
            r2 = r5
        L53:
            X.0HpV r0 = r6.LLJIJIL
            if (r0 == 0) goto L7c
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r0 = r0.LIZJ
            if (r0 == 0) goto L7c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r0.iterator()
        L64:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.common.model.StickerItem r0 = (com.ss.android.ugc.aweme.im.common.model.StickerItem) r0
            java.lang.Long r0 = X.C453550HqT.LIZIZ(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.add(r0)
            goto L64
        L7c:
            X.0I0B r0 = X.C0I0B.LJFF
            X.05sz r0 = r0.LIZIZ()
            r4.LIZIZ(r3, r2, r5, r0)
        L85:
            X.06af r0 = r6.LLILZIL
            X.01GW<X.0Hpf> r0 = r0.LJIIJ
            java.lang.Object r0 = r0.getValue()
            X.0Hpf r0 = (X.InterfaceC453050Hpf) r0
            if (r0 == 0) goto L94
            r0.rU()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452980HpY.LJIIIZ(X.06OO):void");
    }

    @Override // X.AbstractC1700006lC
    public final /* bridge */ /* synthetic */ void LJIILJJIL(C1700106lD c1700106lD) {
        LJIIZILJ();
    }

    @Override // X.AbstractC1700006lC
    public final void LJIILLIIL(C1700106lD c1700106lD) {
        C453470HqL c453470HqL;
        Fragment fragment;
        AssemVMLazy assemVMLazy;
        C453470HqL c453470HqL2;
        Fragment fragment2;
        AssemVMLazy assemVMLazy2;
        int iIntValue;
        C453470HqL c453470HqL3;
        C452950HpV c452950HpV = (C452950HpV) c1700106lD;
        boolean z = false;
        CancellationException cancellationException = null;
        if (C06RM.LIZ()) {
            Integer numValueOf = Integer.valueOf(C451310Hmr.LIZ().itemHeightDp);
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 72;
            }
            View view = this.LLILLL;
            if ((view instanceof C453470HqL) && (c453470HqL3 = (C453470HqL) view) != null) {
                c453470HqL3.setStickerItemSize(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)))));
                c453470HqL3.setAlphaOnlyDismiss(true);
            }
        }
        if (!C06RM.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJIJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            View view2 = this.LLILLL;
            if ((view2 instanceof C453470HqL) && (c453470HqL2 = (C453470HqL) view2) != null && (fragment2 = this.LLILZ.LJ) != null) {
                InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITypingRecommendationVM.class);
                C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 571);
                AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(524);
                if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                    assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment2, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragment2, true), new C338490DOt(fragment2, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment2, 1481), aFwS236S0000000_6, new C451460Hn6(fragment2, true), new C451620HnM(fragment2, true), new C987103tV(fragment2, true));
                } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                    assemVMLazy2 = C451650HnP.LIZ(fragment2, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment2, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragment2, 1482), aFwS236S0000000_6, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragment2, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragment2), C724750Sbp.LJIIIZ(fragment2), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment2, 1483), aFwS236S0000000_6, new C451460Hn6(fragment2, false), new C451620HnM(fragment2, false), new C987103tV(fragment2, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                cancellationException = null;
                this.LLJJIJI = C23250099c.LIZLLL(this.LLJJI, null, null, new C1713706nP(assemVMLazy2, c452950HpV, this, c453470HqL2, null), 3);
            }
        }
        if (C06RM.LIZ()) {
            AnonymousClass0956 anonymousClass09562 = this.LLJJIJI;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(cancellationException);
            }
            View view3 = this.LLILLL;
            if ((view3 instanceof C453470HqL) && (c453470HqL = (C453470HqL) view3) != null && (fragment = this.LLILZ.LJ) != null) {
                InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TypingRecommendationStickerDataVM.class);
                C5182020e c5182020e2 = new C5182020e((C13IQ) c19719912DlLIZ2, 572);
                AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(525);
                if (Intrinsics.LJFF(interfaceC724760Sbq2, C01D1.LIZ)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1484), aFwS236S0000000_62, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
                } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
                    assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new AwS550S0100000_6(fragment, 1485), aFwS236S0000000_62, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                    assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ2), c5182020e2, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1486), aFwS236S0000000_62, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                this.LLJJIJI = C23250099c.LIZLLL(this.LLJJI, null, null, new C1713606nO(assemVMLazy, c453470HqL, this, null), 3);
            }
        }
        C13KL c13kl = C13KL.LIZ;
        String str = c452950HpV.LJ;
        c13kl.getClass();
        this.LLJILJIL = C13KL.LIZIZ(str);
        this.LLJILJILJ = C13KL.LIZJ(c452950HpV.LJ);
        this.LLJIJIL = c452950HpV;
        List<StickerItem> list = c452950HpV.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (StickerItem stickerItem : list) {
            if (stickerItem instanceof IMGiphyInfo) {
                arrayList.add(stickerItem);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((IMGiphyInfo) it2.next()).getSource() == 3) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.LLJJ = z;
        this.LLJILLL.clear();
        Iterator it3 = C13LP.LL(c452950HpV.LIZJ, 10).iterator();
        while (it3.hasNext()) {
            String strLJ = C453550HqT.LJ((StickerItem) it3.next());
            if (strLJ != null) {
                this.LLJILLL.add(strLJ);
            }
        }
    }

    @Override // X.InterfaceC453460HqK
    public final void dl(String str) {
        List<StickerItem> list;
        StickerItem next;
        C452950HpV c452950HpV = this.LLJIJIL;
        if (c452950HpV != null && (list = c452950HpV.LIZJ) != null) {
            Iterator<StickerItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(C453560HqU.LIZIZ(next), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            StickerItem stickerItem = next;
            if (stickerItem != null) {
                IIMEmojiAnalytics.LIZ.getClass();
                IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
                if (iIMEmojiAnalyticsLIZ != null) {
                    iIMEmojiAnalyticsLIZ.LIZJ(stickerItem);
                }
            }
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC456120Huc value;
        String str;
        AnonymousClass0951 anonymousClass0951Kv;
        C1640006bW c1640006bW;
        C05YD<InterfaceC456120Huc> panelType;
        C452950HpV c452950HpV = (C452950HpV) c06oo;
        InterfaceC1628806Zi value2 = this.LLILZIL.LJII.getValue();
        if (value2 != null && (panelType = value2.getPanelType()) != null) {
            value = panelType.getValue();
        } else {
            value = null;
        }
        if (!(!(value instanceof C1629106Zl))) {
            return new C06OH("Keyboard not showing");
        }
        if (c452950HpV.LIZJ.isEmpty()) {
            return new C06OH("Stickers is empty");
        }
        if (!C06RM.LIZ()) {
            InterfaceC453090Hpj value3 = this.LLILZIL.LJIIIIZZ.getValue();
            if (value3 == null || (anonymousClass0951Kv = value3.Kv()) == null || (c1640006bW = (C1640006bW) anonymousClass0951Kv.getValue()) == null || (str = c1640006bW.LIZIZ) == null) {
                str = "";
            }
            if (!Intrinsics.LJFF(str, c452950HpV.LIZLLL)) {
                return new C06OH("Does not match trigger text");
            }
        }
        return C06OI.LIZ;
    }

    @Override // X.InterfaceC453160Hpq
    public final void f3(StickerItem stickerItem, View view, int i, EnumC453020Hpc enumC453020Hpc) {
        AssemVMLazy assemVMLazy;
        RecyclerView recyclerView;
        Integer num;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        List<StickerItem> list;
        List<StickerItem> list2;
        SessionInfo sessionInfo = this.LLILZ.LJI;
        IIMEmojiAnalytics.LIZ.getClass();
        IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
        if (iIMEmojiAnalyticsLIZ != null) {
            String conversationId = sessionInfo.getConversationId();
            String strValueOf = String.valueOf(C0YNP.LJII(sessionInfo.getConversationId()));
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            String strLIZ = C1677606ha.LIZ(sessionInfo.getChatType());
            String strLIZJ = C453550HqT.LIZJ(stickerItem);
            InterfaceC453640Hqc imStickerAnalytics = IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics();
            StickerBase stickerBase = stickerItem.stickerBase;
            if (stickerBase != null) {
                num = stickerBase.stickerType;
            } else {
                num = null;
            }
            String strLIZ2 = imStickerAnalytics.LIZ(num);
            String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLJILLL, ",", null, null, 0, null, null, 62);
            C452950HpV c452950HpV = this.LLJIJIL;
            if (c452950HpV == null || (str = c452950HpV.LJFF) == null) {
                str = "";
            }
            String str3 = this.LLJILJIL;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = this.LLJILJILJ;
            boolean z = this.LLJJ;
            String strValueOf2 = String.valueOf(C453550HqT.LIZIZ(stickerItem));
            C452950HpV c452950HpV2 = this.LLJIJIL;
            if (c452950HpV2 != null && (list2 = c452950HpV2.LIZJ) != null) {
                arrayList = new ArrayList();
                Iterator<StickerItem> it2 = list2.iterator();
                while (it2.hasNext()) {
                    String strLIZJ2 = C453550HqT.LIZJ(it2.next());
                    if (strLIZJ2 != null) {
                        arrayList.add(strLIZJ2);
                    }
                }
            } else {
                arrayList = null;
            }
            C452950HpV c452950HpV3 = this.LLJIJIL;
            if (c452950HpV3 != null && (list = c452950HpV3.LIZJ) != null) {
                arrayList2 = new ArrayList();
                Iterator<StickerItem> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(String.valueOf(C453550HqT.LIZIZ(it3.next())));
                }
            } else {
                arrayList2 = null;
            }
            C452950HpV c452950HpV4 = this.LLJIJIL;
            if (c452950HpV4 != null) {
                str2 = c452950HpV4.LJII;
            } else {
                str2 = null;
            }
            iIMEmojiAnalyticsLIZ.LIZLLL(conversationId, strValueOf, curUserId, strLIZ, strLIZJ, strLIZ2, strLJJLIIIJ, str, str3, str4, z, strValueOf2, i, arrayList, arrayList2, str2, C0I0B.LJFF.LIZIZ());
        }
        int i2 = C453030Hpd.LIZ[enumC453020Hpc.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                StickerBase stickerBase2 = stickerItem.stickerBase;
                if (stickerBase2 != null) {
                    Integer num2 = stickerBase2.stickerType;
                    int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                    if (num2 != null && num2.intValue() == type) {
                        return;
                    }
                }
                StickerBase stickerBase3 = stickerItem.stickerBase;
                if (stickerBase3 != null) {
                    Integer num3 = stickerBase3.stickerType;
                    int type2 = EnumC451180Hme.AISELF_STICKER.getType();
                    if (num3 != null && num3.intValue() == type2) {
                        return;
                    }
                }
                View view2 = this.LLILLL;
                if (view2 != null) {
                    recyclerView = (RecyclerView) view2.findViewById(R.id.w74);
                } else {
                    recyclerView = null;
                }
                View viewSd = C786410Ut5.Sd(R.layout.cs8, C786410Ut5.ne(view.getContext()), null);
                C1391550mJd c1391550mJd = new C1391550mJd(view.getContext());
                c1391550mJd.LLILLJJLI.LIZIZ = view;
                c1391550mJd.LJII(R.attr.bx);
                EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
                C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                c1391600mJi.LIZLLL = enumC1235690iGF;
                c1391600mJi.LJIJJ = true;
                c1391600mJi.LJIIZILJ = viewSd;
                c1391600mJi.LJIJJLI = true;
                c1391550mJd.LIZLLL();
                c1391550mJd.LJIIIZ(true, null);
                c1391550mJd.LJ(new AwS550S0100000_6(recyclerView, 1491));
                c1391550mJd.LIZJ(new AwS585S0100000_6(recyclerView, 396));
                this.LLJJIJIIJIL = c1391550mJd.LIZIZ();
                C786410Ut5.I7(new ACListenerS110S0200000_6(this, stickerItem, 56), viewSd);
                C0P0T c0p0t = this.LLJJIJIIJIL;
                if (c0p0t == null) {
                    return;
                }
                c0p0t.show();
                return;
            }
            throw new C1954807lC();
        }
        Fragment fragment = this.LLILZ.LJ;
        if (fragment != null) {
            InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(ITypingRecommendationVM.class);
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 1487);
            AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(526);
            if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1488), aFwS236S0000000_6, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6(fragment, 1489), aFwS236S0000000_6, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragment, 1490), aFwS236S0000000_6, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
            ((ITypingRecommendationVM) assemVMLazy.getValue()).EQ2();
        }
        IMEditTextAbility iMEditTextAbility = (IMEditTextAbility) C1558520qew.LIZ(this.LLILZ.LJFF, IMEditTextAbility.class, null);
        if (iMEditTextAbility != null) {
            iMEditTextAbility.rv();
        }
        LJIILL(stickerItem, this.LLJI, C451050HmR.LIZ(view));
    }
}

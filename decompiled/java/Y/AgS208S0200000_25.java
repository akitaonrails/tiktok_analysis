package Y;

import X.AbstractC540910LJh;
import X.C013C;
import X.C05P0;
import X.C0NNS;
import X.C0NVY;
import X.C0NW0;
import X.C0NW2;
import X.C1133630fbd;
import X.C1351210lGZ;
import X.C1389890mGx;
import X.C13B1;
import X.C13FG;
import X.C13LP;
import X.C1624570sNT;
import X.C1646050sw7;
import X.C1650560t3O;
import X.C1650980t44;
import X.C1674660tgG;
import X.C1674670tgH;
import X.C1674680tgI;
import X.C1674700tgK;
import X.C1674720tgM;
import X.C1674730tgN;
import X.C1676820tjk;
import X.C1678760tms;
import X.C1684970twt;
import X.C1690050u55;
import X.C1693040u9u;
import X.C1954807lC;
import X.C540870LJd;
import X.C595030NVl;
import X.C595040NVm;
import X.C595170NVz;
import X.C636350Oxd;
import X.EnumC1674690tgJ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1651800t5O;
import X.InterfaceC1674710tgL;
import X.InterfaceC1685080tx4;
import X.InterfaceC1686540tzQ;
import X.InterfaceC346701Wf;
import android.app.Activity;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AgS208S0200000_25 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return emit$20(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS208S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS208S0200000_25 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1687390u0n
            if (r0 == 0) goto L52
            r5 = r8
            X.0u0n r5 = (X.C1687390u0n) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L58
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.getAid()
        L35:
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L50:
            r1 = 0
            goto L35
        L52:
            X.0u0n r5 = new X.0u0n
            r5.<init>(r6, r8)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$0(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS208S0200000_25 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1660280tJ4
            if (r0 == 0) goto L42
            r6 = r9
            X.0tJ4 r6 = (X.C1660280tJ4) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0o8g r8 = (X.InterfaceC1461640o8g) r8
            java.lang.Object r2 = r7.l1
            X.0tLj r2 = (X.C1661930tLj) r2
            r1 = 0
            r0 = 13
            X.0tLj r0 = X.C1661930tLj.LIZ(r2, r8, r1, r0)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L42:
            X.0tJ4 r6 = new X.0tJ4
            r6.<init>(r7, r9)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$1(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.AgS208S0200000_25 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1628540sTs
            if (r0 == 0) goto L56
            r5 = r8
            X.0sTs r5 = (X.C1628540sTs) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L5c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r1 = r7
            X.0sSF r1 = (X.C1627530sSF) r1
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L22
            java.lang.String r1 = r1.LIZ
            java.lang.Object r0 = r6.l1
            X.0sTr r0 = (X.C1628530sTr) r0
            X.0sOv r0 = r0.LLIZ
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJI()
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getEffectId()
        L45:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L54:
            r0 = 0
            goto L45
        L56:
            X.0sTs r5 = new X.0sTs
            r5.<init>(r6, r8)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$10(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$11(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJIJ = C1624570sNT.LJIJ((Effect) obj);
        boolean z = !zLJIJ;
        C1650980t44 c1650980t44LJIIJJI = ((C1650560t3O) agS208S0200000_25.l0).LJIIJJI();
        if (c1650980t44LJIIJJI.LLILZLL != z || c1650980t44LJIIJJI.LLJJIJI != zLJIJ) {
            c1650980t44LJIIJJI.LLILZLL = z;
            c1650980t44LJIIJJI.LLJJIJI = zLJIJ;
            ((InterfaceC1651800t5O) agS208S0200000_25.l1).LIZ(c1650980t44LJIIJJI, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$12(Y.AgS208S0200000_25 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1631470sYb
            if (r0 == 0) goto L3d
            r4 = r7
            X.0sYb r4 = (X.C1631470sYb) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Object r0 = r5.l1
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r0 = r0.invoke(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3d:
            X.0sYb r4 = new X.0sYb
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$12(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$13(Y.AgS208S0200000_25 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1648100szQ
            if (r0 == 0) goto L47
            r5 = r8
            X.0szQ r5 = (X.C1648100szQ) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r1 = r7
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
            java.lang.Object r0 = r6.l1
            X.0szO r0 = (X.C1648080szO) r0
            r0.getClass()
            if (r1 == 0) goto L3e
            java.lang.Integer r0 = X.C1624550sNR.LIZ(r1)
            if (r0 != 0) goto L22
        L3e:
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L47:
            X.0szQ r5 = new X.0szQ
            r5.<init>(r6, r8)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$13(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$14(Y.AgS208S0200000_25 r17, java.lang.Object r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$14(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$15(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        int i2;
        InterfaceC1674710tgL interfaceC1674710tgL = (InterfaceC1674710tgL) obj;
        Activity activity = (Activity) agS208S0200000_25.l0;
        StoryHighlightsCreationVM storyHighlightsCreationVM = (StoryHighlightsCreationVM) agS208S0200000_25.l1;
        if (interfaceC1674710tgL instanceof C1674660tgG) {
            C1674660tgG c1674660tgG = (C1674660tgG) interfaceC1674710tgL;
            int i3 = C1674700tgK.LIZ[c1674660tgG.LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = 2131848991;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i2 = 2131848992;
                }
            } else {
                i2 = 2131848990;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(i2);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            if (c1674660tgG.LIZ == EnumC1674690tgJ.CREATE) {
                storyHighlightsCreationVM.DQ2(null, true);
            }
            activity.finish();
        } else if (interfaceC1674710tgL instanceof C1674670tgH) {
            C1674670tgH c1674670tgH = (C1674670tgH) interfaceC1674710tgL;
            int i4 = C1674700tgK.LIZ[c1674670tgH.LIZ.ordinal()];
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new C1954807lC();
                }
                i = 2131848994;
            } else {
                i = 2131848995;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
            c1389890mGx2.LJIIIZ(i);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIJJI();
            if (c1674670tgH.LIZ == EnumC1674690tgJ.CREATE) {
                storyHighlightsCreationVM.DQ2(null, false);
            }
        } else if (!Intrinsics.LJFF(interfaceC1674710tgL, C1674720tgM.LIZ) && !Intrinsics.LJFF(interfaceC1674710tgL, C1674730tgN.LIZ)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$16(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        int i2;
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager;
        InterfaceC1674710tgL interfaceC1674710tgL = (InterfaceC1674710tgL) obj;
        if (interfaceC1674710tgL instanceof C1674660tgG) {
            C1674660tgG c1674660tgG = (C1674660tgG) interfaceC1674710tgL;
            int i3 = C1674680tgI.LIZ[c1674660tgG.LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = 2131848991;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i2 = 2131848992;
                }
            } else {
                i2 = 2131848990;
            }
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) agS208S0200000_25.l0);
            c1389890mGx.LJIIIZ(i2);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            EnumC1674690tgJ enumC1674690tgJ = c1674660tgG.LIZ;
            if (enumC1674690tgJ == EnumC1674690tgJ.CREATE) {
                ((StoryHighlightsCreationVM) agS208S0200000_25.l1).DQ2(c1674660tgG.LIZIZ, true);
            } else if (enumC1674690tgJ == EnumC1674690tgJ.DELETE && (iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null)) != null) {
                iStoryHighlightsMyDataManager.LJJI();
            }
            ((Activity) agS208S0200000_25.l0).finish();
        } else if (interfaceC1674710tgL instanceof C1674670tgH) {
            C1674670tgH c1674670tgH = (C1674670tgH) interfaceC1674710tgL;
            int i4 = C1674680tgI.LIZ[c1674670tgH.LIZ.ordinal()];
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new C1954807lC();
                }
                i = 2131848994;
            } else {
                i = 2131848995;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx((Activity) agS208S0200000_25.l0);
            c1389890mGx2.LJIIIZ(i);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIJJI();
            if (c1674670tgH.LIZ == EnumC1674690tgJ.CREATE) {
                ((StoryHighlightsCreationVM) agS208S0200000_25.l1).DQ2(null, false);
            }
        } else if (!Intrinsics.LJFF(interfaceC1674710tgL, C1674720tgM.LIZ) && !Intrinsics.LJFF(interfaceC1674710tgL, C1674730tgN.LIZ)) {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$17(Y.AgS208S0200000_25 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1653900t8m
            if (r0 == 0) goto L4b
            r5 = r8
            X.0t8m r5 = (X.C1653900t8m) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L51
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.Number r7 = (java.lang.Number) r7
            int r1 = r7.intValue()
            java.lang.Object r0 = r6.l1
            X.0t8i r0 = (X.C1653860t8i) r0
            X.0sxq r0 = r0.LIZ
            X.0sxt r0 = r0.LIZ
            X.0t8p r0 = r0.LIZ
            java.util.List<X.0t94> r0 = r0.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            if (r0 != r4) goto L22
            return r4
        L4b:
            X.0t8m r5 = new X.0t8m
            r5.<init>(r6, r8)
            goto L12
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$17(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$18(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        ((Boolean) obj).booleanValue();
        C636350Oxd c636350Oxd = (C636350Oxd) ((C05P0) agS208S0200000_25.l1).getValue();
        if (c636350Oxd != null) {
            C1690050u55 c1690050u55 = (C1690050u55) agS208S0200000_25.l0;
            InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJL(c1690050u55.LJIIIZ().LJII());
            if (interfaceC1685080tx4 == null || (interfaceC1685080tx4.getIndex() == c1690050u55.LJIIIZ().LJFF() - 1 && ((int) (interfaceC1685080tx4.LIZ() & 4294967295L)) + C1676820tjk.LIZJ(interfaceC1685080tx4.LJIIL()) <= c1690050u55.LJIIIZ().LIZIZ())) {
                z = true;
            } else {
                z = false;
            }
            c636350Oxd.setCanScrollVertically$mention_video_release(!z);
        }
        return Unit.LIZ;
    }

    public static final Object emit$19(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((C013C) agS208S0200000_25.l0).element && !zBooleanValue) {
            ((InterfaceC1686540tzQ) agS208S0200000_25.l1).LJIJJ(false);
        }
        ((C013C) agS208S0200000_25.l0).element = zBooleanValue;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS208S0200000_25 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1660290tJ5
            if (r0 == 0) goto L42
            r6 = r9
            X.0tJ5 r6 = (X.C1660290tJ5) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0o8g r8 = (X.InterfaceC1461640o8g) r8
            java.lang.Object r2 = r7.l1
            X.0tLj r2 = (X.C1661930tLj) r2
            r1 = 0
            r0 = 13
            X.0tLj r0 = X.C1661930tLj.LIZ(r2, r8, r1, r0)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L42:
            X.0tJ5 r6 = new X.0tJ5
            r6.<init>(r7, r9)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$2(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$20(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (!(c0nns instanceof C595170NVz) && !(c0nns instanceof C1678760tms) && !(c0nns instanceof C0NW2)) {
            if (c0nns instanceof C0NW0) {
                ((C13B1) agS208S0200000_25.l0).LJIIIZ(((C0NW0) c0nns).LIZ);
            } else if (c0nns instanceof C0NVY) {
                ((C13B1) agS208S0200000_25.l0).LJIIIZ(((C0NVY) c0nns).LIZ);
            } else if (c0nns instanceof C595040NVm) {
                ((C13B1) agS208S0200000_25.l0).LJIIIZ(((C595040NVm) c0nns).LIZ);
            } else if (c0nns instanceof C595030NVl) {
                ((C13B1) agS208S0200000_25.l0).LJIIIZ(((C595030NVl) c0nns).LIZ);
            }
        } else {
            ((C13B1) agS208S0200000_25.l0).LJI(c0nns);
        }
        C13B1 c13b1 = (C13B1) agS208S0200000_25.l0;
        C1693040u9u c1693040u9u = (C1693040u9u) agS208S0200000_25.l1;
        Object[] objArr = c13b1.LIZ;
        int i = c13b1.LIZIZ;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (obj2 instanceof C595170NVz) {
                c1693040u9u.getClass();
                i2 |= 2;
            } else if (obj2 instanceof C1678760tms) {
                c1693040u9u.getClass();
                i2 |= 1;
            } else if (obj2 instanceof C0NW2) {
                c1693040u9u.getClass();
                i2 |= 4;
            }
        }
        ((C13FG) ((C1693040u9u) agS208S0200000_25.l1).LIZIZ).LJIIJ(i2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS208S0200000_25 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1685030twz
            if (r0 == 0) goto L49
            r4 = r7
            X.0twz r4 = (X.C1685030twz) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            java.lang.Object r0 = r5.l1
            X.0twt r0 = (X.C1684970twt) r0
            X.0fyA r0 = r0.LJ
            X.0fbd r0 = r0.LIZ
            boolean r0 = r0.LIZIZ
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L49:
            X.0twz r4 = new X.0twz
            r4.<init>(r5, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$3(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$4(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iLJI;
        ((Number) obj).intValue();
        C1133630fbd c1133630fbd = ((C1684970twt) agS208S0200000_25.l0).LJ.LIZ;
        int iLJI2 = ((C1690050u55) agS208S0200000_25.l1).LJI();
        InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJL(((C1690050u55) agS208S0200000_25.l1).LJIIIZ().LJII());
        if (interfaceC1685080tx4 != null) {
            iLJI = interfaceC1685080tx4.getIndex();
        } else {
            iLJI = ((C1690050u55) agS208S0200000_25.l1).LJI();
        }
        ((C1690050u55) agS208S0200000_25.l1).LJIIIIZZ();
        c1133630fbd.LIZLLL = Math.min(iLJI2, c1133630fbd.LIZLLL);
        c1133630fbd.LJ = Math.max(iLJI, c1133630fbd.LJ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS208S0200000_25 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1670200tZ4
            if (r0 == 0) goto L46
            r5 = r8
            X.0tZ4 r5 = (X.C1670200tZ4) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r6.l1
            X.0tRU r0 = (X.InterfaceC1665500tRU) r0
            int r0 = r0.size()
            if (r1 < r0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L46:
            X.0tZ4 r5 = new X.0tZ4
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$5(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS208S0200000_25 r13, java.lang.Object r14, X.InterfaceC1364105Vn r15) {
        /*
            boolean r0 = r15 instanceof X.C1658440tG6
            if (r0 == 0) goto L6d
            r8 = r15
            X.0tG6 r8 = (X.C1658440tG6) r8
            int r2 = r8.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r8.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r9 = 1
            if (r0 == 0) goto L25
            if (r0 != r9) goto L73
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r6 = r13.l0
            X.01Wf r6 = (X.InterfaceC346701Wf) r6
            X.0HZe r14 = (X.C443120HZe) r14
            java.lang.Object r11 = r14.getThird()
            X.0tEP r11 = (X.C1657390tEP) r11
            X.0tRo r10 = new X.0tRo
            X.0tG7 r5 = new X.0tG7
            java.lang.Object r2 = r13.l1
            X.0tG4 r2 = (X.C1658420tG4) r2
            X.0tQH r1 = r2.LLILLJJLI
            X.1Bqa<java.lang.Object>[] r12 = X.C1658420tG4.LLILZ
            r4 = 0
            r0 = r12[r4]
            java.lang.Object r0 = r1.getValue(r2, r0)
            X.0njZ r0 = (X.C1446070njZ) r0
            r5.<init>(r0)
            X.0tG8 r3 = new X.0tG8
            java.lang.Object r2 = r13.l1
            X.0tG4 r2 = (X.C1658420tG4) r2
            X.0tQH r1 = r2.LLILLJJLI
            r0 = r12[r4]
            java.lang.Object r0 = r1.getValue(r2, r0)
            X.0njZ r0 = (X.C1446070njZ) r0
            r3.<init>(r0)
            java.lang.String r0 = r11.LIZLLL
            r10.<init>(r0, r5, r3, r9)
            r8.LLILLJJLI = r9
            java.lang.Object r0 = r6.emit(r10, r8)
            if (r0 != r7) goto L22
            return r7
        L6d:
            X.0tG6 r8 = new X.0tG6
            r8.<init>(r13, r15)
            goto L12
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$6(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$7(Y.AgS208S0200000_25 r13, java.lang.Object r14, X.InterfaceC1364105Vn r15) {
        /*
            boolean r0 = r15 instanceof X.C1660020tIe
            if (r0 == 0) goto Lab
            r9 = r15
            X.0tIe r9 = (X.C1660020tIe) r9
            int r2 = r9.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r9.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r10 = 1
            if (r0 == 0) goto L25
            if (r0 != r10) goto Lb2
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r7 = r13.l0
            X.01Wf r7 = (X.InterfaceC346701Wf) r7
            X.0HZe r14 = (X.C443120HZe) r14
            java.lang.Object r0 = r14.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r14.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r2 = r14.getThird()
            X.0tEP r2 = (X.C1657390tEP) r2
            java.lang.Object r0 = r13.l1
            X.0tId r0 = (X.C1660010tId) r0
            java.util.Map<kotlin.Pair<java.lang.Integer, java.lang.Integer>, java.util.List<X.0HZe<X.0tIO, X.0tQe<? extends X.0tIO, ? extends X.0o8g<? extends X.0tIO>>, X.0tIp<? extends X.0tIO>>>> r11 = r0.LLILLL
            java.lang.Integer r1 = X.C2286608xc.LJ(r1)
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r1, r0)
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Object r5 = r11.get(r6)
            if (r5 != 0) goto La2
            X.0tEa r0 = r2.LIZ
            java.util.List<X.0tIo<? extends X.0tIO>> r1 = r0.LIZ
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r12 = r1.iterator()
        L76:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r1 = r12.next()
            X.0tIo r1 = (X.C1660120tIo) r1
            X.0HZe r4 = new X.0HZe
            T extends X.0tIv r3 = r1.LIZ
            kotlin.jvm.functions.Function0<X.0tQe<? extends T extends X.0tIv, ? extends X.0o8g<? extends T extends X.0tIv>>> r0 = r1.LIZIZ
            java.lang.Object r2 = r0.invoke()
            kotlin.jvm.functions.Function1<X.1DRG, X.0tIp<? extends T extends X.0tIv>> r1 = r1.LIZJ
            java.lang.Object r0 = r13.l1
            X.0tId r0 = (X.C1660010tId) r0
            X.1DRG r0 = r0.LL
            java.lang.Object r0 = r1.invoke(r0)
            r4.<init>(r3, r2, r0)
            r5.add(r4)
            goto L76
        L9f:
            r11.put(r6, r5)
        La2:
            r9.LLILLJJLI = r10
            java.lang.Object r0 = r7.emit(r5, r9)
            if (r0 != r8) goto L22
            return r8
        Lab:
            X.0tIe r9 = new X.0tIe
            r9.<init>(r13, r15)
            goto L12
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$7(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS208S0200000_25 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1660050tIh
            if (r0 == 0) goto L47
            r6 = r9
            X.0tIh r6 = (X.C1660050tIh) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.util.List r8 = (java.util.List) r8
            X.0eJD r2 = X.EnumC1083770eJD.TOP
            X.0tIi r1 = new X.0tIi
            java.lang.Object r0 = r7.l1
            X.0tIf r0 = (X.C1660030tIf) r0
            r1.<init>(r0)
            X.0tIm r0 = new X.0tIm
            r0.<init>(r8, r2, r1)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L47:
            X.0tIh r6 = new X.0tIh
            r6.<init>(r7, r9)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS208S0200000_25.emit$8(Y.AgS208S0200000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$9(AgS208S0200000_25 agS208S0200000_25, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC540910LJh abstractC540910LJh = (AbstractC540910LJh) obj;
        if (abstractC540910LJh instanceof C540870LJd) {
            C540870LJd c540870LJd = (C540870LJd) abstractC540910LJh;
            int i = c540870LJd.LIZ;
            ViewPager viewPager = (ViewPager) agS208S0200000_25.l0;
            if (viewPager != null) {
                viewPager.setCurrentItem(i);
            }
            if (c540870LJd.LIZIZ) {
                new C1351210lGZ(((C1646050sw7) agS208S0200000_25.l1).LLILLL.requireSceneContext()).LIZIZ(50, 61);
            }
        }
        return Unit.LIZ;
    }
}

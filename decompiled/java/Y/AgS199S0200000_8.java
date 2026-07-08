package Y;

import X.AbstractC528270Knh;
import X.AbstractC540910LJh;
import X.C09AE;
import X.C0LMR;
import X.C0LSZ;
import X.C0MIK;
import X.C1308910kAL;
import X.C13BV;
import X.C1627370sRz;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2296808zG;
import X.C381270ExB;
import X.C522090Kdj;
import X.C522130Kdn;
import X.C524150Kh3;
import X.C525860Kjo;
import X.C525870Kjp;
import X.C525890Kjr;
import X.C525920Kju;
import X.C525930Kjv;
import X.C525950Kjx;
import X.C539060LCe;
import X.C540870LJd;
import X.C547060Lcu;
import X.C557210LtH;
import X.C558710Lvh;
import X.C559010LwB;
import X.C578290MmB;
import X.C578910MnB;
import X.C786410Ut5;
import X.EnumC578300MmC;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import X.InterfaceC525940Kjw;
import X.InterfaceC528570KoB;
import X.InterfaceC557150LtB;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDataManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.DMPlaygroundTopTabScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class AgS199S0200000_8 implements InterfaceC346701Wf {
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
            case 21:
                return emit$21(this, obj, interfaceC1364105Vn);
            case 22:
                return emit$22(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0LMR] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0LMR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.C0LMR r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.LIZ$0(X.0LMR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0LCe] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0LCe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(X.C539060LCe r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.LIZ$1(X.0LCe, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$2(X.C0LMR r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C541800LMs
            if (r0 == 0) goto L45
            r4 = r7
            X.0LMs r4 = (X.C541800LMs) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4b
            X.0LMR r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Object r0 = r5.l1
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r6
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            int r0 = r6.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r0 = r1.invoke(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L45:
            X.0LMs r4 = new X.0LMs
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.LIZ$2(X.0LMR, X.05Vn):java.lang.Object");
    }

    public AgS199S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz == null) {
            return Unit.LIZ;
        }
        ((C557210LtH) agS199S0200000_8.l0).LJ.onNext(C2286608xc.LJ(((InterfaceC557150LtB) ((C557210LtH) agS199S0200000_8.l0).LJI.getValue()).LIZ((C0LSZ) agS199S0200000_8.l1, c0lsz.LJII)));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS199S0200000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C0MHG
            if (r0 == 0) goto L46
            r5 = r8
            X.0MHG r5 = (X.C0MHG) r5
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
            X.0MHA r0 = (X.C0MHA) r0
            java.lang.String r1 = r0.LIZJ
            java.lang.Object r0 = r6.l1
            X.0MHA r0 = (X.C0MHA) r0
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L46:
            X.0MHG r5 = new X.0MHG
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$1(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$10(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        InterfaceC525940Kjw interfaceC525940Kjw = (InterfaceC525940Kjw) obj;
        int i2 = 0;
        if (interfaceC525940Kjw instanceof C525920Kju) {
            C525920Kju c525920Kju = (C525920Kju) interfaceC525940Kjw;
            List<TikTokMediaModel> list = c525920Kju.LIZIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<TikTokMediaModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJIILJJIL() && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            int size = c525920Kju.LIZIZ.size() - i2;
            C525860Kjo c525860Kjo = (C525860Kjo) agS199S0200000_8.l0;
            if (C524150Kh3.LIZ(((AlbumSelectionConfig) c525860Kjo.LLJILLL.getValue(c525860Kjo, C525860Kjo.LLJJI[3])).mode, i2, size)) {
                ((C525860Kjo) agS199S0200000_8.l0).LJJJI();
            }
            ChooseMediaViewModel chooseMediaViewModel = ((C525860Kjo) agS199S0200000_8.l0).LLILZ;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.sR2(c525920Kju.LIZ);
            }
        } else if (interfaceC525940Kjw instanceof C525930Kjv) {
            C525930Kjv c525930Kjv = (C525930Kjv) interfaceC525940Kjw;
            TikTokMediaModel tikTokMediaModel = c525930Kjv.LIZ;
            tikTokMediaModel.selectIndex = -1;
            for (TikTokMediaModel tikTokMediaModel2 : ((C525860Kjo) agS199S0200000_8.l0).LJJJ().m02()) {
                tikTokMediaModel2.selectIndex = ((C525860Kjo) agS199S0200000_8.l0).LJJJ().NE2(tikTokMediaModel2) + 1;
            }
            AbstractC528270Knh abstractC528270Knh = ((C525860Kjo) agS199S0200000_8.l0).LLILZIL;
            if (abstractC528270Knh != null) {
                abstractC528270Knh.LLLZIL(tikTokMediaModel);
            }
            AbstractC528270Knh abstractC528270Knh2 = ((C525860Kjo) agS199S0200000_8.l0).LLJ;
            if (abstractC528270Knh2 != null) {
                abstractC528270Knh2.LLLZIL(tikTokMediaModel);
            }
            AbstractC528270Knh abstractC528270Knh3 = ((C525860Kjo) agS199S0200000_8.l0).LLILZLL;
            if (abstractC528270Knh3 != null) {
                abstractC528270Knh3.LLLZIL(tikTokMediaModel);
            }
            AbstractC528270Knh abstractC528270Knh4 = ((C525860Kjo) agS199S0200000_8.l0).LLIZ;
            if (abstractC528270Knh4 != null) {
                abstractC528270Knh4.LLLZIL(tikTokMediaModel);
            }
            AbstractC528270Knh abstractC528270Knh5 = ((C525860Kjo) agS199S0200000_8.l0).LLIZLLLIL;
            if (abstractC528270Knh5 != null) {
                abstractC528270Knh5.LLLZIL(tikTokMediaModel);
            }
            AbstractC528270Knh abstractC528270Knh6 = ((C525860Kjo) agS199S0200000_8.l0).LLJI;
            if (abstractC528270Knh6 != null) {
                abstractC528270Knh6.LLLZIL(tikTokMediaModel);
            }
            ((C525860Kjo) agS199S0200000_8.l0).LJJJI();
            ChooseMediaViewModel chooseMediaViewModel2 = ((C525860Kjo) agS199S0200000_8.l0).LLILZ;
            if (chooseMediaViewModel2 != null) {
                chooseMediaViewModel2.tR2(c525930Kjv.LIZ);
            }
        } else if (interfaceC525940Kjw instanceof C525950Kjx) {
            for (TikTokMediaModel tikTokMediaModel3 : ((C525860Kjo) agS199S0200000_8.l0).LJJJ().m02()) {
                tikTokMediaModel3.selectIndex = ((C525860Kjo) agS199S0200000_8.l0).LJJJ().NE2(tikTokMediaModel3) + 1;
            }
            AbstractC528270Knh abstractC528270Knh7 = ((C525860Kjo) agS199S0200000_8.l0).LLILZIL;
            if (abstractC528270Knh7 != null) {
                abstractC528270Knh7.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh8 = ((C525860Kjo) agS199S0200000_8.l0).LLJ;
            if (abstractC528270Knh8 != null) {
                abstractC528270Knh8.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh9 = ((C525860Kjo) agS199S0200000_8.l0).LLJI;
            if (abstractC528270Knh9 != null) {
                abstractC528270Knh9.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh10 = ((C525860Kjo) agS199S0200000_8.l0).LLIZ;
            if (abstractC528270Knh10 != null) {
                abstractC528270Knh10.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh11 = ((C525860Kjo) agS199S0200000_8.l0).LLILZLL;
            if (abstractC528270Knh11 != null) {
                abstractC528270Knh11.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh12 = ((C525860Kjo) agS199S0200000_8.l0).LLIZLLLIL;
            if (abstractC528270Knh12 != null) {
                abstractC528270Knh12.LLLLZLLLI();
            }
        } else if (interfaceC525940Kjw instanceof C525890Kjr) {
            C525890Kjr c525890Kjr = (C525890Kjr) interfaceC525940Kjw;
            int size2 = c525890Kjr.LIZIZ.size() - c525890Kjr.LIZ.size();
            List<TikTokMediaModel> listSubList = c525890Kjr.LIZIZ.subList(0, size2);
            if ((listSubList instanceof Collection) && listSubList.isEmpty()) {
                i = 0;
            } else {
                Iterator<TikTokMediaModel> it3 = listSubList.iterator();
                i = 0;
                while (it3.hasNext()) {
                    if (it3.next().LJIILJJIL() && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            int i3 = size2 - i;
            for (TikTokMediaModel tikTokMediaModel4 : c525890Kjr.LIZ) {
                if (tikTokMediaModel4.LJIILJJIL()) {
                    i++;
                } else {
                    i3++;
                }
                if (i2 == 0) {
                    C525860Kjo c525860Kjo2 = (C525860Kjo) agS199S0200000_8.l0;
                    if (C524150Kh3.LIZ(((AlbumSelectionConfig) c525860Kjo2.LLJILLL.getValue(c525860Kjo2, C525860Kjo.LLJJI[3])).mode, i, i3)) {
                        ((C525860Kjo) agS199S0200000_8.l0).LJJJI();
                        i2 = 1;
                    } else {
                        ChooseMediaViewModel chooseMediaViewModel3 = ((C525860Kjo) agS199S0200000_8.l0).LLILZ;
                        if (chooseMediaViewModel3 != null) {
                            chooseMediaViewModel3.sR2(tikTokMediaModel4);
                        }
                    }
                }
            }
        } else if (interfaceC525940Kjw instanceof C525870Kjp) {
            for (TikTokMediaModel tikTokMediaModel5 : ((C525870Kjp) interfaceC525940Kjw).LIZ) {
                tikTokMediaModel5.selectIndex = -1;
                AbstractC528270Knh abstractC528270Knh13 = ((C525860Kjo) agS199S0200000_8.l0).LLILZIL;
                if (abstractC528270Knh13 != null) {
                    abstractC528270Knh13.LLLZIL(tikTokMediaModel5);
                }
                AbstractC528270Knh abstractC528270Knh14 = ((C525860Kjo) agS199S0200000_8.l0).LLJ;
                if (abstractC528270Knh14 != null) {
                    abstractC528270Knh14.LLLZIL(tikTokMediaModel5);
                }
                AbstractC528270Knh abstractC528270Knh15 = ((C525860Kjo) agS199S0200000_8.l0).LLILZLL;
                if (abstractC528270Knh15 != null) {
                    abstractC528270Knh15.LLLZIL(tikTokMediaModel5);
                }
                AbstractC528270Knh abstractC528270Knh16 = ((C525860Kjo) agS199S0200000_8.l0).LLIZ;
                if (abstractC528270Knh16 != null) {
                    abstractC528270Knh16.LLLZIL(tikTokMediaModel5);
                }
                AbstractC528270Knh abstractC528270Knh17 = ((C525860Kjo) agS199S0200000_8.l0).LLIZLLLIL;
                if (abstractC528270Knh17 != null) {
                    abstractC528270Knh17.LLLZIL(tikTokMediaModel5);
                }
                AbstractC528270Knh abstractC528270Knh18 = ((C525860Kjo) agS199S0200000_8.l0).LLJI;
                if (abstractC528270Knh18 != null) {
                    abstractC528270Knh18.LLLZIL(tikTokMediaModel5);
                }
                ChooseMediaViewModel chooseMediaViewModel4 = ((C525860Kjo) agS199S0200000_8.l0).LLILZ;
                if (chooseMediaViewModel4 != null) {
                    chooseMediaViewModel4.tR2(tikTokMediaModel5);
                }
                C522130Kdn c522130Kdn = ((C522090Kdj) agS199S0200000_8.l1).LIZ;
                if (c522130Kdn != null) {
                    c522130Kdn.LIZIZ(tikTokMediaModel5);
                }
            }
            for (TikTokMediaModel tikTokMediaModel6 : ((C525860Kjo) agS199S0200000_8.l0).LJJJ().m02()) {
                tikTokMediaModel6.selectIndex = ((C525860Kjo) agS199S0200000_8.l0).LJJJ().NE2(tikTokMediaModel6) + 1;
            }
            ((C525860Kjo) agS199S0200000_8.l0).LJJJI();
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$11(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer numLIZJ;
        Integer numLIZJ2;
        AbstractC540910LJh abstractC540910LJh = (AbstractC540910LJh) obj;
        if (abstractC540910LJh instanceof C540870LJd) {
            if (((C540870LJd) abstractC540910LJh).LIZ == ((DMPlaygroundTopTabScene.PlaygroundTopTabCell) agS199S0200000_8.l0).getLayoutPosition()) {
                Context context = ((TuxTextView) agS199S0200000_8.l1).getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
                    ((TuxTextView) agS199S0200000_8.l1).setTextColor(numLIZJ2.intValue());
                }
            } else {
                Context context2 = ((TuxTextView) agS199S0200000_8.l1).getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.hp, context2)) != null) {
                    ((TuxTextView) agS199S0200000_8.l1).setTextColor(numLIZJ.intValue());
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object next;
        C558710Lvh c558710Lvh = (C558710Lvh) agS199S0200000_8.l1;
        Iterator it2 = ((List) obj).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C0LSZ c0lsz = (C0LSZ) next;
                if (Intrinsics.LJFF(c558710Lvh.getEditModel().getAILivePhotoModel().getTaskId(), c0lsz.LIZ) && c558710Lvh.getEditModel().getAILivePhotoModel().LIZIZ().createdAt <= c0lsz.LJIJJ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0LSZ c0lsz2 = (C0LSZ) next;
        if (c0lsz2 == null) {
            C559010LwB.LIZ("AILiveTaskHandler", "flow return");
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("flow collect, job=");
        sbLIZ.append(((InterfaceC497601wk) agS199S0200000_8.l0).getCoroutineContext().get(C09AE.LJJLJ));
        sbLIZ.append(", taskInfo=");
        sbLIZ.append(c0lsz2);
        C559010LwB.LIZIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ));
        ((C558710Lvh) agS199S0200000_8.l1).c3(c0lsz2, false);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$13(Y.AgS199S0200000_8 r10, java.lang.Object r11, X.InterfaceC1364105Vn r12) {
        /*
            boolean r0 = r12 instanceof X.C558730Lvj
            if (r0 == 0) goto L83
            r5 = r12
            X.0Lvj r5 = (X.C558730Lvj) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 != r6) goto L89
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r10.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r11.iterator()
        L37:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r7 = r9.next()
            r8 = r7
            X.0LSZ r8 = (X.C0LSZ) r8
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = r8.LJIIL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.EDIT_AI_LIVE_PHOTO
            if (r1 != r0) goto L37
            java.lang.Object r0 = r10.l1
            X.0Lvh r0 = (X.C558710Lvh) r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getEditModel()
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r0 = r0.getAILivePhotoModel()
            java.lang.String r1 = r0.getTaskId()
            java.lang.String r0 = r8.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L37
            java.lang.String r1 = r8.LJ
            java.lang.String r0 = "STOPPED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L37
            java.lang.String r1 = r8.LJ
            java.lang.String r0 = "CANCELED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L37
            r2.add(r7)
            goto L37
        L7a:
            r5.LLILLJJLI = r6
            java.lang.Object r0 = r3.emit(r2, r5)
            if (r0 != r4) goto L22
            return r4
        L83:
            X.0Lvj r5 = new X.0Lvj
            r5.<init>(r10, r12)
            goto L12
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$13(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$14(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        UploadPicStickerARPresenter uploadPicStickerARPresenter;
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        if (((Boolean) pair.getSecond()).booleanValue()) {
            ((C578910MnB) agS199S0200000_8.l0).LJJIZ((C1627370sRz) agS199S0200000_8.l1);
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("aigc_clear_ar_presenter_killswitch", false) && (uploadPicStickerARPresenter = ((C578910MnB) agS199S0200000_8.l0).LLJJIJI) != null) {
            uploadPicStickerARPresenter.LJJIFFI();
        }
        ((C578910MnB) agS199S0200000_8.l0).LJJJ(zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$15(Y.AgS199S0200000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C533330Kvr
            if (r0 == 0) goto L3e
            r5 = r8
            X.0Kvr r5 = (X.C533330Kvr) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r7)
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            if (r0 != r4) goto L22
            return r4
        L3e:
            X.0Kvr r5 = new X.0Kvr
            r5.<init>(r6, r8)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$15(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$16(Y.AgS199S0200000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C533340Kvs
            if (r0 == 0) goto L3e
            r5 = r8
            X.0Kvs r5 = (X.C533340Kvs) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r7)
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            if (r0 != r4) goto L22
            return r4
        L3e:
            X.0Kvs r5 = new X.0Kvs
            r5.<init>(r6, r8)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$16(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$17(Y.AgS199S0200000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0LUK
            if (r0 == 0) goto L42
            r4 = r7
            X.0LUK r4 = (X.C0LUK) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0LSZ r6 = (X.C0LSZ) r6
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = (com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl) r0
            r0.getClass()
            X.0LU9 r0 = com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZIZ(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L42:
            X.0LUK r4 = new X.0LUK
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$17(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$18(Y.AgS199S0200000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0LUL
            if (r0 == 0) goto L42
            r4 = r7
            X.0LUL r4 = (X.C0LUL) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0LSZ r6 = (X.C0LSZ) r6
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = (com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl) r0
            r0.getClass()
            X.0LU9 r0 = com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZIZ(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L42:
            X.0LUL r4 = new X.0LUL
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$18(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$19(Y.AgS199S0200000_8 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0LUJ
            if (r0 == 0) goto L42
            r4 = r7
            X.0LUJ r4 = (X.C0LUJ) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0LSZ r6 = (X.C0LSZ) r6
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl r0 = (com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl) r0
            r0.getClass()
            X.0LU9 r0 = com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl.LIZIZ(r6)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L42:
            X.0LUJ r4 = new X.0LUJ
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$19(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS199S0200000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C0MHH
            if (r0 == 0) goto L46
            r5 = r8
            X.0MHH r5 = (X.C0MHH) r5
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
            X.0MHA r0 = (X.C0MHA) r0
            java.lang.String r1 = r0.LIZJ
            java.lang.Object r0 = r6.l1
            X.0MHA r0 = (X.C0MHA) r0
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L46:
            X.0MHH r5 = new X.0MHH
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$2(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$20(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz != null && C381270ExB.LIZ(c0lsz.LJFF) && !((C547060Lcu) agS199S0200000_8.l0).LIZJ.get()) {
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZJ = ((C547060Lcu) agS199S0200000_8.l0).LIZJ();
            if (iCreationAsyncTaskManagerLIZJ != null) {
                iCreationAsyncTaskManagerLIZJ.LJII(((C547060Lcu) agS199S0200000_8.l0).LIZ);
            }
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZJ2 = ((C547060Lcu) agS199S0200000_8.l0).LIZJ();
            if (iCreationAsyncTaskManagerLIZJ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AsyncTaskHandle");
                sbLIZ.append(((C547060Lcu) agS199S0200000_8.l0).LIZ);
                iCreationAsyncTaskManagerLIZJ2.LJI(C2188811AlT.LIZIZ(sbLIZ), AFwS189S0000000_3.get$arr$(377), false);
            }
            C2296808zG.LIZJ((InterfaceC497601wk) agS199S0200000_8.l1, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$21(Y.AgS199S0200000_8 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0LCX
            if (r0 == 0) goto L55
            r6 = r9
            X.0LCX r6 = (X.C0LCX) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L44
            if (r0 != r4) goto L5b
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r7.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.util.List r8 = (java.util.List) r8
            X.0LCT r1 = X.C0LCT.LIZ
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage r0 = (com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage) r0
            java.lang.String r0 = r0.creationId
            r6.LLILLL = r2
            r6.LLILLJJLI = r3
            java.lang.Object r1 = r1.LIZ(r0, r8, r6)
            if (r1 != r5) goto L49
            return r5
        L44:
            X.01Wf r2 = r6.LLILLL
            X.C155000ia.LIZIZ(r1)
        L49:
            r0 = 0
            r6.LLILLL = r0
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L25
            return r5
        L55:
            X.0LCX r6 = new X.0LCX
            r6.<init>(r7, r9)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$21(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$22(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS199S0200000_8.LIZ$2((C0LMR) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS199S0200000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C554640Lp8
            if (r0 == 0) goto L40
            r5 = r8
            X.0Lp8 r5 = (X.C554640Lp8) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.Object r0 = r6.l1
            X.0LmO r0 = (X.C552940LmO) r0
            java.lang.String r1 = r0.LIZ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r7)
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            if (r0 != r4) goto L22
            return r4
        L40:
            X.0Lp8 r5 = new X.0Lp8
            r5.<init>(r6, r8)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$3(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$4(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS199S0200000_8.LIZ$0((C0LMR) obj, interfaceC1364105Vn);
    }

    public static final /* bridge */ /* synthetic */ Object emit$5(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS199S0200000_8.LIZ$1((C539060LCe) obj, interfaceC1364105Vn);
    }

    public static final Object emit$6(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i = C578290MmB.LIZ[((EnumC578300MmC) obj).ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            ((PopupWindow) agS199S0200000_8.l0).dismiss();
        } else {
            C786410Ut5.k3((PopupWindow) agS199S0200000_8.l0, (View) agS199S0200000_8.l1, 0, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        ((C0MIK) agS199S0200000_8.l0).LIZ.LIZIZ((Effect) agS199S0200000_8.l1, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS199S0200000_8 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            X.0Kod r8 = (X.C528850Kod) r8
            java.lang.Object r0 = r7.l0
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r7.l1
            X.0KoU r0 = (X.C528760KoU) r0
            java.util.List<X.0KqA> r1 = r0.LLLILZ
            if (r1 == 0) goto L5b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5b
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C557670Lu1
            if (r0 == 0) goto L21
        L2f:
            if (r8 == 0) goto L42
            java.lang.Integer r0 = r8.LIZJ
            if (r0 == 0) goto L42
            java.lang.Object r2 = r7.l1
            X.0KoU r2 = (X.C528760KoU) r2
            int r1 = r0.intValue()
            if (r1 == r3) goto L45
            r0 = 2
            if (r1 == r0) goto L45
        L42:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            android.app.Activity r2 = r2.mActivity
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r1 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r1.<init>()
            r0 = 2131825504(0x7f111360, float:1.9283866E38)
            r1.messageRes(r0)
            r1.isTuxToastLegacy(r3)
            r0 = 6019(0x1783, float:8.434E-42)
            X.C1390380mHk.LIZ(r2, r0, r1)
            goto L42
        L5b:
            java.lang.Object r1 = r7.l1
            X.0KoU r1 = (X.C528760KoU) r1
            boolean r0 = r1.LLLZLZ
            if (r0 == 0) goto L94
            X.0LQY r0 = X.C0LQY.AI_PORTRAIT
            r1.f(r0)
        L68:
            java.lang.Object r6 = r7.l1
            X.0KoU r6 = (X.C528760KoU) r6
            X.0Lu1 r5 = new X.0Lu1
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AlbumAiSelfTaskViewModel r4 = r6.LLZLI()
            X.0KoX r2 = new X.0KoX
            java.lang.Object r0 = r7.l1
            X.0KoU r0 = (X.C528760KoU) r0
            r2.<init>(r0)
            java.lang.Object r1 = r7.l1
            X.0KoU r1 = (X.C528760KoU) r1
            X.0KrJ r0 = r1.LLZL()
            r5.<init>(r4, r2, r1, r0)
            java.util.List r1 = java.util.Collections.singletonList(r5)
            java.lang.Object r0 = r7.l1
            X.0KoU r0 = (X.C528760KoU) r0
            boolean r0 = r0.LLLIIL
            r6.LLLLLLZ(r1, r0)
            goto L2f
        L94:
            boolean r0 = r1.LLLZL
            if (r0 == 0) goto L68
            r1.g()
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS199S0200000_8.emit$8(Y.AgS199S0200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$9(AgS199S0200000_8 agS199S0200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        ((LiveRecordingsDataManager) agS199S0200000_8.l0).LLJI = (List) pair.getFirst();
        if (((LiveRecordingsDataManager) agS199S0200000_8.l0).LLIZLLLIL) {
            ((InterfaceC528570KoB) agS199S0200000_8.l1).LIZ((List) pair.getFirst(), Intrinsics.LJFF(pair.getSecond(), true));
        } else {
            ((InterfaceC528570KoB) agS199S0200000_8.l1).LIZ(C13BV.INSTANCE, Intrinsics.LJFF(pair.getSecond(), true));
        }
        return Unit.LIZ;
    }
}

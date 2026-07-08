package Y;

import X.AbstractC401801hI;
import X.C0U6J;
import X.C0U74;
import X.C0U78;
import X.C13BV;
import X.C16F5;
import X.C1954807lC;
import X.C20441214yg;
import X.C2296808zG;
import X.C396001gM;
import X.C403601ha;
import X.C491401vk;
import X.C753620ThI;
import X.C753630ThJ;
import X.C753650ThL;
import X.C753660ThM;
import X.C767630U9h;
import X.C767640U9i;
import X.EnumC767650U9j;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import X.InterfaceC766480U4w;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import com.bytedance.android.live.effect.beauty.multiguest.LiveBeautySubItemMultiGuestFragment;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AgS202S0200000_12 implements InterfaceC346701Wf {
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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.AbstractC401801hI<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS202S0200000_12.LIZ$0(X.01hI, X.05Vn):java.lang.Object");
    }

    public AgS202S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS202S0200000_12 agS202S0200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer num;
        int iIntValue;
        RunnableC781530UlD runnableC781530UlD;
        if (obj instanceof C753620ThI) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((SinglePropsSelectorDialog) agS202S0200000_12.l0).LLILZLL;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJFF();
            }
            C20441214yg.LJ("SinglePropsSelectorDialog", "failed to fetch stickers!");
        } else if (!(obj instanceof C753650ThL)) {
            if (obj instanceof C753660ThM) {
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = ((SinglePropsSelectorDialog) agS202S0200000_12.l0).LLILZLL;
                if (viewOnClickListenerC1836610xtT2 != null) {
                    viewOnClickListenerC1836610xtT2.LJI();
                }
                C20441214yg.LJ("SinglePropsSelectorDialog", "loading to fetch stickers!");
            } else if (obj instanceof C753630ThJ) {
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = ((SinglePropsSelectorDialog) agS202S0200000_12.l0).LLILZLL;
                if (viewOnClickListenerC1836610xtT3 != null) {
                    viewOnClickListenerC1836610xtT3.LIZLLL();
                }
                C0U6J c0u6j = ((SinglePropsSelectorDialog) agS202S0200000_12.l0).LLIZ;
                if (c0u6j != null) {
                    c0u6j.setData(((SinglePropsViewModel) agS202S0200000_12.l1).LL);
                }
                SinglePropsSelectorDialog singlePropsSelectorDialog = (SinglePropsSelectorDialog) agS202S0200000_12.l0;
                C0U6J c0u6j2 = singlePropsSelectorDialog.LLIZ;
                if (c0u6j2 != null && (num = c0u6j2.LLIZLLLIL) != null && (iIntValue = num.intValue()) >= 0 && (runnableC781530UlD = singlePropsSelectorDialog.LLILZIL) != null) {
                    Boolean.valueOf(HandlerHook.viewPost(runnableC781530UlD, new ARunnableS23S0101000_12(iIntValue, singlePropsSelectorDialog, 3)));
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$1(AgS202S0200000_12 agS202S0200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS202S0200000_12.LIZ$0((AbstractC401801hI) obj, interfaceC1364105Vn);
    }

    public static final Object emit$2(AgS202S0200000_12 agS202S0200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C396001gM) {
            C396001gM c396001gM = (C396001gM) abstractC401801hI;
            if (Intrinsics.LJFF(c396001gM.LIZ, "multi")) {
                ((IEffectPlatformBaseListener) agS202S0200000_12.l0).onSuccess(new ArrayList(c396001gM.LIZIZ));
                C2296808zG.LIZJ((InterfaceC497601wk) agS202S0200000_12.l1, null);
            }
        } else if ((abstractC401801hI instanceof C491401vk) && Intrinsics.LJFF(((C491401vk) abstractC401801hI).LIZ, "multi")) {
            ((IEffectPlatformBaseListener) agS202S0200000_12.l0).onSuccess(C13BV.INSTANCE);
            C2296808zG.LIZJ((InterfaceC497601wk) agS202S0200000_12.l1, null);
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS202S0200000_12 agS202S0200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object next;
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C396001gM) {
            C767630U9h c767630U9h = C767630U9h.LL;
            List<T> list = ((C396001gM) abstractC401801hI).LIZIZ;
            c767630U9h.getClass();
            if (C767630U9h.LJFF("background")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (true ^ InterfaceC766480U4w.LJJIIZI.LIZIZ().contains(((LiveEffect) obj2).getResourceId())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        LiveEffect liveEffect = (LiveEffect) next;
                        if (liveEffect.LLJJIJIL()) {
                            C767630U9h.LL.getClass();
                            if (C767630U9h.LJIIIIZZ(liveEffect)) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect2 = (LiveEffect) next;
                if (liveEffect2 != null) {
                    EnumC767650U9j enumC767650U9j = EnumC767650U9j.BACKGROUND_INSERT;
                    C767630U9h.LL.getClass();
                    C767640U9i c767640U9i = new C767640U9i(liveEffect2, 0L, 0L, enumC767650U9j, C767630U9h.LJII(liveEffect2));
                    c767630U9h.LIZJ(c767640U9i);
                    LiveEffect liveEffect3 = c767640U9i.LIZ;
                    if (liveEffect3 != null) {
                        StickerEffectViewModel.FQ2((BgEffectViewModel) agS202S0200000_12.l1, liveEffect3, null, 30);
                    }
                }
            }
            C2296808zG.LIZJ((InterfaceC497601wk) agS202S0200000_12.l0, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS202S0200000_12 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C775980UcG
            if (r0 == 0) goto L48
            r5 = r8
            X.0UcG r5 = (X.C775980UcG) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            com.bytedance.android.live.broadcast.stablemode.ModuleDecision r0 = (com.bytedance.android.live.broadcast.stablemode.ModuleDecision) r0
            java.lang.String r1 = r0.module
            java.lang.Object r0 = r6.l1
            X.0Uc9 r0 = (X.EnumC775910Uc9) r0
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L48:
            X.0UcG r5 = new X.0UcG
            r5.<init>(r6, r8)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS202S0200000_12.emit$4(Y.AgS202S0200000_12, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r2 = r4.iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r2.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r2.next().LJLJLJ() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r1 < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS202S0200000_12 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS202S0200000_12.emit$5(Y.AgS202S0200000_12, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$6(AgS202S0200000_12 agS202S0200000_12, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object next;
        List<T> list;
        Object next2;
        LiveEffect liveEffect;
        String resourceId;
        List<LiveEffect> listQr;
        LiveEffect next3;
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C403601ha) {
            List<C0U74<T>> list2 = ((C403601ha) abstractC401801hI).LIZ;
            LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment = (LiveBeautySubItemMultiGuestFragment) agS202S0200000_12.l1;
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C0U74) next).LIZ, liveBeautySubItemMultiGuestFragment.LLILZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0U74 c0u74 = (C0U74) next;
            if (c0u74 != null && (list = c0u74.LIZIZ) != 0) {
                LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment2 = (LiveBeautySubItemMultiGuestFragment) agS202S0200000_12.l1;
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(liveBeautySubItemMultiGuestFragment2.LLILLJJLI, ((LiveEffect) next2).getResourceId())) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                LiveEffect liveEffect2 = (LiveEffect) next2;
                if (liveEffect2 != null) {
                    LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment3 = (LiveBeautySubItemMultiGuestFragment) agS202S0200000_12.l1;
                    String name = liveEffect2.getName();
                    liveBeautySubItemMultiGuestFragment3.LLILLL = name;
                    C16F5 c16f5 = liveBeautySubItemMultiGuestFragment3.LLJ;
                    if (c16f5 != null) {
                        c16f5.setText(name);
                    }
                    List<LiveEffect> listLL = liveEffect2.LL();
                    if (listLL != null) {
                        LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment4 = (LiveBeautySubItemMultiGuestFragment) agS202S0200000_12.l1;
                        C0U78 c0u78 = liveBeautySubItemMultiGuestFragment4.LLIZLLLIL;
                        if (c0u78 != null && (listQr = c0u78.qr(liveBeautySubItemMultiGuestFragment4.LLIZ)) != null) {
                            Iterator<LiveEffect> it4 = listQr.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next3 = it4.next();
                                    if (Intrinsics.LJFF(next3.LLILII(), liveBeautySubItemMultiGuestFragment4.LLILLJJLI)) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            liveEffect = next3;
                        } else {
                            liveEffect = null;
                        }
                        Iterator<LiveEffect> it5 = listLL.iterator();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            String resourceId2 = it5.next().getResourceId();
                            if (liveEffect != null) {
                                resourceId = liveEffect.getResourceId();
                            } else {
                                resourceId = null;
                            }
                            if (Intrinsics.LJFF(resourceId2, resourceId)) {
                                if (i2 >= 0) {
                                    i = i2;
                                }
                            } else {
                                i2++;
                            }
                        }
                        ListProtector.get(listLL, i);
                        Function1<? super LiveEffect, Unit> function1 = liveBeautySubItemMultiGuestFragment4.LLILZLL;
                        if (function1 != null) {
                            function1.invoke(ListProtector.get(listLL, i));
                        }
                        liveBeautySubItemMultiGuestFragment4.LL.LLLLLLLZIL(i, listLL);
                    }
                }
            }
            C2296808zG.LIZJ((InterfaceC497601wk) agS202S0200000_12.l0, null);
        }
        return Unit.LIZ;
    }
}

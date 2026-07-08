package X;

import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0EQT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.task.LyricStickerEDASyncTask$onSyncData$2", f = "LyricStickerEDASyncTask.kt", l = {}, m = "invokeSuspend")
public final class C0EQT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C366110EWz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EQT(C366110EWz c366110EWz, InterfaceC1364105Vn<? super C0EQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c366110EWz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EQT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<LyricStickerModel> listI4;
        C0EZ1 c0ez1WM2;
        C0EZ1 c0ez1WM22;
        List<LyricStickerModel> listI42;
        List<LyricStickerModel> listI43;
        C0EZ1 c0ez1WM23;
        C0EZ1 c0ez1WM24;
        List<LyricStickerModel> listI44;
        C0EZ1 c0ez1WM25;
        List<LyricStickerModel> listI45;
        C0EZ1 c0ez1WM26;
        List<LyricStickerModel> listI46;
        C1C7U.LIZ("LyricStickerEDASyncTask@645a.onSyncData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ = this.LL.LJIIIIZZ();
        Unit unit = null;
        if (interfaceC1461350o8DLJIIIIZZ != null && (c0ez1WM25 = interfaceC1461350o8DLJIIIIZZ.WM2()) != null && (listI45 = c0ez1WM25.i4()) != null) {
            C366110EWz c366110EWz = this.LL;
            ArrayList<LyricStickerModel> arrayList = new ArrayList();
            for (LyricStickerModel lyricStickerModel : listI45) {
                LyricStickerModel lyricStickerModel2 = lyricStickerModel;
                C0EHC c0ehc = (C0EHC) c366110EWz.LLILLL.getValue(c366110EWz, C366110EWz.LLILZIL[0]);
                if (c0ehc != null && (listI46 = c0ehc.i4()) != null) {
                    Iterator<LyricStickerModel> it2 = listI46.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LyricStickerModel next = it2.next();
                        LyricStickerModel lyricStickerModel3 = next;
                        if (Intrinsics.LJFF(lyricStickerModel2.getUuid(), lyricStickerModel3.getUuid()) && lyricStickerModel2.getBaseStickerModel().getId() == lyricStickerModel3.getBaseStickerModel().getId()) {
                            if (next == null) {
                            }
                        }
                    }
                }
                arrayList.add(lyricStickerModel);
            }
            C366110EWz c366110EWz2 = this.LL;
            for (LyricStickerModel lyricStickerModel4 : arrayList) {
                InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ2 = c366110EWz2.LJIIIIZZ();
                if (interfaceC1461350o8DLJIIIIZZ2 != null && (c0ez1WM26 = interfaceC1461350o8DLJIIIIZZ2.WM2()) != null) {
                    String uuid = lyricStickerModel4.getUuid();
                    if (uuid == null) {
                        uuid = "";
                    }
                    c0ez1WM26.g3(uuid, EnumC356070Dxd.NONE);
                }
            }
        }
        C366110EWz c366110EWz3 = this.LL;
        C0EHC c0ehc2 = (C0EHC) c366110EWz3.LLILLL.getValue(c366110EWz3, C366110EWz.LLILZIL[0]);
        if (c0ehc2 != null && (listI43 = c0ehc2.i4()) != null) {
            C366110EWz c366110EWz4 = this.LL;
            ArrayList<LyricStickerModel> arrayList2 = new ArrayList();
            for (LyricStickerModel lyricStickerModel5 : listI43) {
                LyricStickerModel lyricStickerModel6 = lyricStickerModel5;
                InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ3 = c366110EWz4.LJIIIIZZ();
                if (interfaceC1461350o8DLJIIIIZZ3 != null && (c0ez1WM24 = interfaceC1461350o8DLJIIIIZZ3.WM2()) != null && (listI44 = c0ez1WM24.i4()) != null) {
                    Iterator<LyricStickerModel> it3 = listI44.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            LyricStickerModel next2 = it3.next();
                            LyricStickerModel lyricStickerModel7 = next2;
                            if (Intrinsics.LJFF(lyricStickerModel7.getUuid(), lyricStickerModel6.getUuid()) && lyricStickerModel7.getBaseStickerModel().getId() == lyricStickerModel6.getBaseStickerModel().getId()) {
                                if (next2 != null) {
                                    arrayList2.add(lyricStickerModel5);
                                }
                            }
                        }
                    }
                }
            }
            C366110EWz c366110EWz5 = this.LL;
            for (LyricStickerModel lyricStickerModel8 : arrayList2) {
                InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ4 = c366110EWz5.LJIIIIZZ();
                if (interfaceC1461350o8DLJIIIIZZ4 != null && (c0ez1WM23 = interfaceC1461350o8DLJIIIIZZ4.WM2()) != null) {
                    c0ez1WM23.x1(lyricStickerModel8, EnumC356070Dxd.NONE);
                }
            }
        }
        C366110EWz c366110EWz6 = this.LL;
        C0EHC c0ehc3 = (C0EHC) c366110EWz6.LLILLL.getValue(c366110EWz6, C366110EWz.LLILZIL[0]);
        if (c0ehc3 != null && (listI4 = c0ehc3.i4()) != null) {
            C366110EWz c366110EWz7 = this.LL;
            ArrayList<LyricStickerModel> arrayList3 = new ArrayList();
            for (LyricStickerModel lyricStickerModel9 : listI4) {
                LyricStickerModel lyricStickerModel10 = lyricStickerModel9;
                InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ5 = c366110EWz7.LJIIIIZZ();
                if (interfaceC1461350o8DLJIIIIZZ5 != null && (c0ez1WM22 = interfaceC1461350o8DLJIIIIZZ5.WM2()) != null && (listI42 = c0ez1WM22.i4()) != null) {
                    Iterator<LyricStickerModel> it4 = listI42.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        LyricStickerModel next3 = it4.next();
                        LyricStickerModel lyricStickerModel11 = next3;
                        if (Intrinsics.LJFF(lyricStickerModel11.getUuid(), lyricStickerModel10.getUuid()) && lyricStickerModel11.getBaseStickerModel().getId() == lyricStickerModel10.getBaseStickerModel().getId()) {
                            if (next3 == null) {
                            }
                        }
                    }
                }
                arrayList3.add(lyricStickerModel9);
            }
            C366110EWz c366110EWz8 = this.LL;
            for (LyricStickerModel lyricStickerModel12 : arrayList3) {
                InterfaceC1461350o8D interfaceC1461350o8DLJIIIIZZ6 = c366110EWz8.LJIIIIZZ();
                if (interfaceC1461350o8DLJIIIIZZ6 != null && (c0ez1WM2 = interfaceC1461350o8DLJIIIIZZ6.WM2()) != null) {
                    c0ez1WM2.h1(lyricStickerModel12, EnumC356070Dxd.NONE);
                }
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("LyricStickerEDASyncTask@645a.onSyncData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

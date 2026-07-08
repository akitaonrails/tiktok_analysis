package X;

import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391250FVr {
    public final /* synthetic */ C196864120o LIZ;

    public C391250FVr(C196864120o c196864120o) {
        this.LIZ = c196864120o;
    }

    public final void LIZ(boolean z) {
        Integer numValueOf;
        C121V c121v;
        View view;
        C196925122x c196925122x;
        InterfaceC19657911vd interfaceC19657911vdUp0;
        C1664680tQA<C19656711vR> c1664680tQALIZ;
        C19656711vR c19656711vR;
        this.LIZ.getClass();
        this.LIZ.getClass();
        InterfaceC391240FVq interfaceC391240FVqLLLIZZ = this.LIZ.LLLIZZ();
        InterfaceC391260FVs interfaceC391260FVs = null;
        if (interfaceC391240FVqLLLIZZ != null && (interfaceC19657911vdUp0 = interfaceC391240FVqLLLIZZ.up0()) != null && (c1664680tQALIZ = interfaceC19657911vdUp0.LIZ()) != null && (c19656711vR = c1664680tQALIZ.LIZ) != null) {
            numValueOf = Integer.valueOf(c19656711vR.LIZ);
        } else {
            numValueOf = null;
        }
        if (z) {
            this.LIZ.LLLLIL().D6(EnumC390580FTc.EMPHASIZED, new AwS584S0100000_5(numValueOf, 188));
        } else {
            this.LIZ.LLLLIL().D6(EnumC390580FTc.IGNORED, new AwS584S0100000_5(numValueOf, 189));
        }
        this.LIZ.getClass();
        if (!z) {
            C121I c121i = this.LIZ.LLLLIILL().LLLII;
            if ((c121i instanceof C196925122x) && (c196925122x = (C196925122x) c121i) != null) {
                c196925122x.setHighlightState(EnumC390580FTc.EMPHASIZED);
            }
            Object obj = this.LIZ.LLLLIILL().LLLII;
            if ((obj instanceof C19610711o1) && (view = (View) obj) != null) {
                float fLLLIILIL = C196864120o.LLLIILIL(true);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                view.setAlpha(fLLLIILIL);
            }
            C121I c121i2 = this.LIZ.LLLLIILL().LLLII;
            if ((c121i2 instanceof C121V) && (c121v = (C121V) c121i2) != null) {
                this.LIZ.getClass();
                c121v.LIZ();
            }
        }
        C121I c121i3 = this.LIZ.LLLLIILL().LLLII;
        if (c121i3 instanceof InterfaceC391260FVs) {
            interfaceC391260FVs = (InterfaceC391260FVs) c121i3;
        }
        if (!z) {
            if (interfaceC391260FVs != null) {
                this.LIZ.getClass();
                interfaceC391260FVs.LIZ();
                return;
            } else {
                this.LIZ.getClass();
                this.LIZ.getClass();
                return;
            }
        }
        this.LIZ.getClass();
        this.LIZ.getClass();
    }

    public final void LIZIZ(boolean z, boolean z2) {
        Integer numValueOf;
        List<LyricStickerModel> listI4;
        C121V c121v;
        View view;
        C196925122x c196925122x;
        List<LyricStickerModel> listI42;
        InterfaceC19657911vd interfaceC19657911vdUp0;
        C1664680tQA<C19656711vR> c1664680tQALIZ;
        C19656711vR c19656711vR;
        if (!((Boolean) this.LIZ.LLJLIL.getValue()).booleanValue() || z2) {
            InterfaceC391240FVq interfaceC391240FVqLLLIZZ = this.LIZ.LLLIZZ();
            if (interfaceC391240FVqLLLIZZ != null) {
                interfaceC391240FVqLLLIZZ.aR(C196864120o.LLLIILIL(!z));
            }
            InterfaceC391240FVq interfaceC391240FVqLLLIZZ2 = this.LIZ.LLLIZZ();
            if (interfaceC391240FVqLLLIZZ2 != null) {
                interfaceC391240FVqLLLIZZ2.xm2(!z);
            }
        }
        InterfaceC391240FVq interfaceC391240FVqLLLIZZ3 = this.LIZ.LLLIZZ();
        InterfaceC391260FVs interfaceC391260FVs = null;
        if (interfaceC391240FVqLLLIZZ3 != null && (interfaceC19657911vdUp0 = interfaceC391240FVqLLLIZZ3.up0()) != null && (c1664680tQALIZ = interfaceC19657911vdUp0.LIZ()) != null && (c19656711vR = c1664680tQALIZ.LIZ) != null) {
            numValueOf = Integer.valueOf(c19656711vR.LIZ);
        } else {
            numValueOf = null;
        }
        if (z) {
            this.LIZ.LLLLIL().D6(EnumC390580FTc.EMPHASIZED, new AwS584S0100000_5(numValueOf, 190));
            this.LIZ.LLLLIL().D6(EnumC390580FTc.IGNORED, new AwS584S0100000_5(numValueOf, 191));
            C0EZ1 c0ez1LLLJL = this.LIZ.LLLJL();
            if (c0ez1LLLJL != null && (listI42 = c0ez1LLLJL.i4()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listI42, 10));
                for (LyricStickerModel lyricStickerModel : listI42) {
                    arrayList.add(lyricStickerModel.copy(lyricStickerModel.baseStickerModel, lyricStickerModel.uuid, lyricStickerModel.clipStart, lyricStickerModel.clipEnd, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, lyricStickerModel.textStickerModels, lyricStickerModel.fallbackFonts, Boolean.FALSE));
                }
                C0EZ1 c0ez1LLLJL2 = this.LIZ.LLLJL();
                if (c0ez1LLLJL2 != null) {
                    c0ez1LLLJL2.f(arrayList, EnumC356070Dxd.COMMIT);
                }
            }
            C121I c121i = this.LIZ.LLLLIILL().LLLII;
            if ((c121i instanceof C196925122x) && (c196925122x = (C196925122x) c121i) != null) {
                c196925122x.setHighlightState(EnumC390580FTc.EMPHASIZED);
            }
            Object obj = this.LIZ.LLLLIILL().LLLII;
            if ((obj instanceof C19610711o1) && (view = (View) obj) != null) {
                float fLLLIILIL = C196864120o.LLLIILIL(true);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                view.setAlpha(fLLLIILIL);
            }
            C121I c121i2 = this.LIZ.LLLLIILL().LLLII;
            if ((c121i2 instanceof C121V) && (c121v = (C121V) c121i2) != null) {
                this.LIZ.getClass();
                c121v.LIZ();
            }
        } else {
            this.LIZ.LLLLIL().D6(EnumC390580FTc.NORMAL, AFwS234S0000000_5.get$arr$(120));
            C0EZ1 c0ez1LLLJL3 = this.LIZ.LLLJL();
            if (c0ez1LLLJL3 != null && (listI4 = c0ez1LLLJL3.i4()) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listI4, 10));
                for (LyricStickerModel lyricStickerModel2 : listI4) {
                    arrayList2.add(lyricStickerModel2.copy(lyricStickerModel2.baseStickerModel, lyricStickerModel2.uuid, lyricStickerModel2.clipStart, lyricStickerModel2.clipEnd, lyricStickerModel2.musicId, lyricStickerModel2.lyricId, lyricStickerModel2.musicName, lyricStickerModel2.lyricStyleUrs, lyricStickerModel2.selectedFrom, lyricStickerModel2.lyricStyleEffectId, lyricStickerModel2.recommendWidth, lyricStickerModel2.recommendHeight, lyricStickerModel2.initialTrimInfo, lyricStickerModel2.textStickerModels, lyricStickerModel2.fallbackFonts, Boolean.TRUE));
                }
                C0EZ1 c0ez1LLLJL4 = this.LIZ.LLLJL();
                if (c0ez1LLLJL4 != null) {
                    c0ez1LLLJL4.f(arrayList2, EnumC356070Dxd.COMMIT);
                }
            }
        }
        C121I c121i3 = this.LIZ.LLLLIILL().LLLII;
        if (c121i3 instanceof InterfaceC391260FVs) {
            interfaceC391260FVs = (InterfaceC391260FVs) c121i3;
        }
        if (!z || interfaceC391260FVs != null) {
            this.LIZ.getClass();
        } else {
            this.LIZ.getClass();
        }
        this.LIZ.getClass();
        if (z && interfaceC391260FVs != null) {
            this.LIZ.getClass();
            interfaceC391260FVs.LIZ();
        }
        this.LIZ.getClass();
    }
}

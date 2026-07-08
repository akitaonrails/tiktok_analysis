package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$setSegment$3$1", f = "StickerItemView.kt", l = {275}, m = "invokeSuspend")
public final class C352040Dr8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C367470Eav LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352040Dr8(C367470Eav c367470Eav, long j, InterfaceC1364105Vn<? super C352040Dr8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c367470Eav;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352040Dr8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerItemView@8b0e.setSegment$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String ttsAudioPath = this.LLILLJJLI.getTtsAudioPath();
            int i2 = (int) (this.LLILLL / ((long) 33));
            this.LL = 1;
            obj = C352030Dr7.LIZ(i2, ttsAudioPath, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StickerItemView@8b0e.setSegment$3$1");
                return objLJFF;
            }
        }
        float[] fArr = (float[]) obj;
        C367470Eav c367470Eav = this.LLILLJJLI;
        int length = fArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            ((ArrayList) c367470Eav.LLLI).add(new Pair(C2286608xc.LJFF(i4 * 33), C2286608xc.LIZLLL(fArr[i3])));
            i3++;
            i4++;
        }
        this.LLILLJJLI.requestLayout();
        this.LLILLJJLI.postInvalidate();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.setSegment$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

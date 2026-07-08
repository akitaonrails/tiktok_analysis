package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EQS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.lyric.LyricStickerEditorProComponent$applyDefaultLyricEffect$4", f = "LyricStickerEditorProComponent.kt", l = {498, 503}, m = "invokeSuspend")
public final class C0EQS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0EQI LLILLL;
    public final /* synthetic */ List<AVMusic> LLILZ;
    public final /* synthetic */ MutableLiveData<Integer> LLILZIL;
    public final /* synthetic */ C365600EVa LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0EQS(C0EQI c0eqi, List<? extends AVMusic> list, MutableLiveData<Integer> mutableLiveData, C365600EVa c365600EVa, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1364105Vn<? super C0EQS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0eqi;
        this.LLILZ = list;
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = c365600EVa;
        this.LLIZ = function0;
        this.LLIZLLLIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0EQS c0eqs = new C0EQS(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0eqs.LLILLJJLI = obj;
        return c0eqs;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r15 = r20
            java.lang.String r6 = "LyricStickerEditorProComponent@267e.applyDefaultLyricEffect$4"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r19
            int r0 = r3.LL
            r4 = 2
            r14 = 1
            if (r0 == 0) goto L38
            if (r0 == r14) goto L67
            if (r0 != r4) goto L8e
            java.lang.Object r7 = r3.LLILLJJLI
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            X.C155000ia.LIZIZ(r15)
        L1e:
            if (r15 == 0) goto L96
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r3.LLILZIL
            r0 = 100
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.postValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r7.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L38:
            X.C155000ia.LIZIZ(r15)
            java.lang.Object r8 = r3.LLILLJJLI
            X.01wk r8 = (X.InterfaceC497601wk) r8
            kotlin.jvm.internal.AwS41S0500000_5 r7 = new kotlin.jvm.internal.AwS41S0500000_5
            X.0EVa r9 = r3.LLILZLL
            X.0EQI r10 = r3.LLILLL
            kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r3.LLIZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r3.LLIZLLLIL
            r13 = 3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.0EQI r0 = r3.LLILLL
            X.0EYh r5 = r0.m3()
            if (r5 == 0) goto La4
            java.util.List<com.ss.android.ugc.aweme.creative.model.music.AVMusic> r1 = r3.LLILZ
            r3.LLILLJJLI = r7
            r3.LL = r14
            java.lang.String r0 = "edit_pro_sound"
            java.lang.Object r15 = r5.Uu0(r14, r1, r0, r3)
            if (r15 != r2) goto L6e
            X.C1C7U.LIZIZ(r6)
            return r2
        L67:
            java.lang.Object r7 = r3.LLILLJJLI
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            X.C155000ia.LIZIZ(r15)
        L6e:
            kotlin.Pair r15 = (kotlin.Pair) r15
            if (r15 == 0) goto La4
            X.0EQI r0 = r3.LLILLL
            X.0EYh r13 = r0.m3()
            if (r13 == 0) goto L96
            r3.LLILLJJLI = r7
            r3.LL = r4
            r17 = 0
            r16 = r14
            r18 = r3
            java.lang.Object r15 = r13.N82(r14, r15, r16, r17, r18)
            if (r15 != r2) goto L1e
            X.C1C7U.LIZIZ(r6)
            return r2
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        La4:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EQS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

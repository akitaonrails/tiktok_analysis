package X;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.core.utils.LoadImageUtil$loadRoundImage$1", f = "LoadImageUtil.kt", l = {42}, m = "invokeSuspend")
public final class C0JSQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;
    public final /* synthetic */ C1322000kVS LLILZ;
    public final /* synthetic */ InterfaceC1142670fqD LLILZIL;
    public final /* synthetic */ ImageModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JSQ(int i, ImageView imageView, C1322000kVS c1322000kVS, InterfaceC1142670fqD interfaceC1142670fqD, ImageModel imageModel, InterfaceC1364105Vn<? super C0JSQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = imageView;
        this.LLILZ = c1322000kVS;
        this.LLILZIL = interfaceC1142670fqD;
        this.LLILZLL = imageModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JSQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r6 = "LoadImageUtil@d15e.loadRoundImage$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r7.LL
            r4 = 2131373737(0x7f0a2ea9, float:1.8367574E38)
            r0 = 1
            if (r1 == 0) goto L20
            if (r1 != r0) goto L3b
            X.C155000ia.LIZIZ(r8)
        L16:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            if (r8 != 0) goto L49
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L20:
            X.C155000ia.LIZIZ(r8)
            int r3 = r7.LLILLJJLI
            r2 = 0
            if (r3 <= 0) goto L43
            r7.LL = r0
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01dN r0 = new X.01dN
            r0.<init>(r3, r2)
            java.lang.Object r8 = X.C23250099c.LJI(r7, r1, r0)
            if (r8 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L43:
            android.widget.ImageView r0 = r7.LLILLL
            r0.setTag(r4, r2)
            goto L5d
        L49:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L58
            android.widget.ImageView r1 = r7.LLILLL
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()
            r1.setTag(r4, r0)
        L58:
            X.0kVS r0 = r7.LLILZ
            r0.getClass()
        L5d:
            X.0fqD r3 = r7.LLILZIL
            if (r3 == 0) goto L6c
            X.0kVS r2 = r7.LLILZ
            X.0fqC r1 = new X.0fqC
            com.bytedance.android.live.base.model.ImageModel r0 = r7.LLILZLL
            r1.<init>(r0, r3)
            r2.LIZLLL = r1
        L6c:
            X.0kVS r1 = r7.LLILZ
            android.widget.ImageView r0 = r7.LLILLL
            r1.LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JSQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

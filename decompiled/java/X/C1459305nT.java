package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05nT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupAvatarLocalGenerationHelper$generateLocalGroupAvatar$1", f = "GroupAvatarLocalGenerationHelper.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1459305nT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ List<C1462005nu> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ ImageView LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1459305nT(Context context, InterfaceC497601wk interfaceC497601wk, List<C1462005nu> list, int i, int i2, float f, ImageView imageView, InterfaceC1364105Vn<? super C1459305nT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = f;
        this.LLIZLLLIL = imageView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1459305nT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupAvatarLocalGenerationHelper@4438.generateLocalGroupAvatar$1");
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
            Context context = this.LLILLJJLI;
            InterfaceC497601wk interfaceC497601wk = this.LLILLL;
            List<C1462005nu> list = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1462005nu> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getDisplayAvatar());
            }
            int i2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            this.LL = 1;
            obj = C433940Gzw.LIZ.LIZ(context, interfaceC497601wk, arrayList, i2, i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupAvatarLocalGenerationHelper@4438.generateLocalGroupAvatar$1");
                return objLJFF;
            }
        }
        this.LLIZLLLIL.setImageBitmap((Bitmap) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupAvatarLocalGenerationHelper@4438.generateLocalGroupAvatar$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fakewrite.IMMockConvAvatarCacheManager$loadLocalAvatar$1$1$1$1", f = "IMMockConvAvatarCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C1460605ng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1322110kVd LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ Resources LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460605ng(C1322110kVd c1322110kVd, String str, Bitmap bitmap, Resources resources, InterfaceC1364105Vn<? super C1460605ng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1322110kVd;
        this.LLILLJJLI = str;
        this.LLILLL = bitmap;
        this.LLILZ = resources;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1460605ng(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadLocalAvatar finish after wait, avatar: ");
        C1460405ne c1460405ne = C1460405ne.LIZ;
        C1322110kVd c1322110kVd = this.LL;
        c1460405ne.getClass();
        sbLIZ.append(C1460405ne.LIZJ(c1322110kVd));
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILLJJLI);
        if (c0y8tLIZ != null && c0y8tLIZ.isTemp() && c0y8tLIZ.isGroupChat()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LLILZ, this.LLILLL);
            this.LL.setImageDrawable(bitmapDrawable);
            C1331070kk5 hierarchy = this.LL.getHierarchy();
            if (hierarchy != null) {
                hierarchy.LJIJ(bitmapDrawable, 1);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMockConvAvatarCacheManager@3db3.loadLocalAvatar$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

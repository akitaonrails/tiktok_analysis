package X;

import android.database.Cursor;
import android.provider.MediaStore;
import com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.OpenEditPageHandlerActivity$handleFromTTS$1$onPermissionGranted$1$onResult$1", f = "OpenEditPageHandlerActivity.kt", l = {}, m = "invokeSuspend")
public final class C20131113pl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OpenEditPageHandlerActivity LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20131113pl(OpenEditPageHandlerActivity openEditPageHandlerActivity, String str, InterfaceC1364105Vn<? super C20131113pl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = openEditPageHandlerActivity;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20131113pl(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OpenEditPageHandlerActivity@29dd.handleFromTTS$1$onPermissionGranted$1$onResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LL.getContentResolver(), MediaStore.Video.Media.getContentUri("external"), null, "_display_name=?", new String[]{this.LLILLJJLI}, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepapGAzjeW788Bhk1Y3or5Rk0s3FksZjNpx/+i0WBeIJbKgU/+3K0=", null));
        if (cursorLJJJ != null && cursorLJJJ.moveToNext()) {
            this.LL.openVideoEdit();
        } else {
            OpenEditPageHandlerActivity.handleFromTTS$openRecord(this.LL);
        }
        if (cursorLJJJ != null) {
            cursorLJJJ.close();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenEditPageHandlerActivity@29dd.handleFromTTS$1$onPermissionGranted$1$onResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

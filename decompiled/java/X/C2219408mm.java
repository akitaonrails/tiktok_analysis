package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$stickerHasFace$tempFile$1$1", f = "IdAndElementViewModel.kt", l = {413}, m = "invokeSuspend")
public final class C2219408mm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super File>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IdAndElementViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219408mm(Context context, String str, IdAndElementViewModel idAndElementViewModel, InterfaceC1364105Vn<? super C2219408mm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = idAndElementViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2219408mm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BufferedInputStream bufferedInputStream;
        InputStream inputStream;
        C1C7U.LIZ("IdAndElementViewModel@a6fe.stickerHasFace$tempFile$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C2219308ml c2219308ml = C2219308ml.LIZ;
                Context context = this.LLILLJJLI;
                String str = this.LLILLL;
                this.LL = 1;
                obj = c2219308ml.LIZIZ(context, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IdAndElementViewModel@a6fe.stickerHasFace$tempFile$1$1");
                    return objLJFF;
                }
            }
            inputStream = (InputStream) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (inputStream != null) {
            if (inputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) inputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            }
        } else {
            bufferedInputStream = null;
        }
        if (bufferedInputStream == null) {
            C1C7U.LIZIZ("IdAndElementViewModel@a6fe.stickerHasFace$tempFile$1$1");
            return null;
        }
        try {
            File fileCQ2 = this.LLILZ.CQ2(bufferedInputStream, this.LLILLL);
            IdAndElementViewModel idAndElementViewModel = this.LLILZ;
            idAndElementViewModel.getClass();
            try {
                bufferedInputStream.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                idAndElementViewModel.getLogger().LIZJ("IdAndElementViewModel", "Failed to close sticker image stream", e2);
            }
            C1C7U.LIZIZ("IdAndElementViewModel@a6fe.stickerHasFace$tempFile$1$1");
            return fileCQ2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            IdAndElementViewModel idAndElementViewModel2 = this.LLILZ;
            idAndElementViewModel2.getClass();
            try {
                bufferedInputStream.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                idAndElementViewModel2.getLogger().LIZJ("IdAndElementViewModel", "Failed to close sticker image stream", e3);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super File> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.16Hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750116Hr implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$1(C20750116Hr c20750116Hr) {
    }

    public static final void onSubscribe$1(C20750116Hr c20750116Hr, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    public static final void onComplete$0(C20750116Hr c20750116Hr) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) c20750116Hr.l1;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) c20750116Hr.l0;
        uploadImageMethod.getClass();
        uploadImageMethod.LJI(new UploadImageMethod.Result(imageResultArr));
    }

    public static final void onError$0(C20750116Hr c20750116Hr, Throwable th) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) c20750116Hr.l1;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) c20750116Hr.l0;
        uploadImageMethod.getClass();
        uploadImageMethod.LJI(new UploadImageMethod.Result(imageResultArr));
    }

    public static final void onError$1(C20750116Hr c20750116Hr, Throwable th) {
        ((C20700915zT) c20750116Hr.l0).LIZ.LIZ();
    }

    public static final void onNext$0(C20750116Hr c20750116Hr, Object obj) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) c20750116Hr.l1;
        int i = uploadImageMethod.LLIZLLLIL + 1;
        uploadImageMethod.LLIZLLLIL = i;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) c20750116Hr.l0;
        if (i == imageResultArr.length) {
            uploadImageMethod.LJI(new UploadImageMethod.Result(imageResultArr));
        }
    }

    public static final void onNext$1(C20750116Hr c20750116Hr, Object obj) {
        InterfaceC20700815zS interfaceC20700815zS;
        if (((BaseResponse) obj).status_code == 0 && (interfaceC20700815zS = ((C20700915zT) c20750116Hr.l0).LIZ) != null) {
            interfaceC20700815zS.LIZIZ((String[]) c20750116Hr.l1);
        }
    }

    public static final void onSubscribe$0(C20750116Hr c20750116Hr, InterfaceC420801kM interfaceC420801kM) {
        ((UploadImageMethod) c20750116Hr.l1).LLILZIL = interfaceC420801kM;
    }

    public C20750116Hr(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}

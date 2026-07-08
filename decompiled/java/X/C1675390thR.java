package X;

import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0thR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1675390thR extends C2217421BqW implements Function1<InterfaceC1664410tPj<? extends String>, Unit> {
    public C1675390thR(Object obj) {
        super(1, obj, PhotoPreviewViewModel.class, "onSelectionChange", "onSelectionChange(Lkotlinx/collections/immutable/ImmutableSet;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1664410tPj<? extends String> interfaceC1664410tPj) {
        Object value;
        InterfaceC1664410tPj<? extends String> interfaceC1664410tPj2 = interfaceC1664410tPj;
        PhotoPreviewViewModel photoPreviewViewModel = (PhotoPreviewViewModel) this.receiver;
        if (interfaceC1664410tPj2.size() == ((C1675380thQ) photoPreviewViewModel.LLILLJJLI.getValue()).LIZIZ.size()) {
            photoPreviewViewModel.LLILLL.postValue(C1675420thU.LIZ);
        } else {
            C2252321DDq c2252321DDq = photoPreviewViewModel.LL;
            do {
                value = c2252321DDq.getValue();
            } while (!c2252321DDq.compareAndSet(value, C1675380thQ.LIZ((C1675380thQ) value, null, null, null, interfaceC1664410tPj2, null, false, false, 119)));
        }
        return Unit.LIZ;
    }
}

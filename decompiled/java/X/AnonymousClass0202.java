package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesApi;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.originalPanel.StickerItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0202, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0202 implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(AnonymousClass0202 anonymousClass0202) {
    }

    public static final void onComplete$1(AnonymousClass0202 anonymousClass0202) {
    }

    public static final void onError$1(AnonymousClass0202 anonymousClass0202, Throwable th) {
    }

    public static final void onSubscribe$0(AnonymousClass0202 anonymousClass0202, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(AnonymousClass0202 anonymousClass0202, InterfaceC420801kM interfaceC420801kM) {
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

    public static final void onError$0(AnonymousClass0202 anonymousClass0202, Throwable th) {
        ((Function1) anonymousClass0202.l1).invoke(th);
    }

    public static final void onNext$0(AnonymousClass0202 anonymousClass0202, Object obj) {
        Integer num;
        LocationServicesApi.DeleteLocationHistoryResponse deleteLocationHistoryResponse = (LocationServicesApi.DeleteLocationHistoryResponse) obj;
        if (deleteLocationHistoryResponse.status_code == 0 && (num = deleteLocationHistoryResponse.resultCode) != null) {
            ((Function1) anonymousClass0202.l0).invoke(Integer.valueOf(num.intValue()));
        }
    }

    public static final void onNext$1(AnonymousClass0202 anonymousClass0202, Object obj) {
        StickerItemList stickerItemList = (StickerItemList) obj;
        stickerItemList.getCursor();
        Function1 function1 = (Function1) anonymousClass0202.l0;
        C1631090sXz c1631090sXz = (C1631090sXz) anonymousClass0202.l1;
        final int cursor = stickerItemList.getCursor();
        final List<NewFaceStickerBean> stickers = stickerItemList.getStickers();
        c1631090sXz.getClass();
        function1.invoke(new InterfaceC252500yJ(cursor, stickers) { // from class: X.00yE
            public final int LIZ;
            public final List<NewFaceStickerBean> LIZIZ;

            @Override // X.InterfaceC252500yJ
            public final List<String> LIZ() {
                ArrayList arrayList = new ArrayList();
                Iterator<NewFaceStickerBean> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().effectId);
                }
                return arrayList;
            }

            @Override // X.InterfaceC252500yJ
            public final int getCursor() {
                return this.LIZ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = cursor;
                this.LIZIZ = stickers;
            }
        });
    }

    public AnonymousClass0202(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

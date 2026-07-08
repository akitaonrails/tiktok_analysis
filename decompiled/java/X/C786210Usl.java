package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.network.response.BaseResponse;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Usl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786210Usl implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
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

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public static final void onError$0(C786210Usl c786210Usl, Throwable th) {
        ((C754410TiZ) c786210Usl.l0).LIZLLL(th);
    }

    public static final void onError$1(C786210Usl c786210Usl, Throwable th) {
        ((C780870Uk9) c786210Usl.l0).LIZJ(th);
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("error_code", "1", jSONObject);
        C0K04.LJFF("error_msg", th.toString(), jSONObject);
    }

    public static final void onSubscribe$0(C786210Usl c786210Usl, InterfaceC420801kM interfaceC420801kM) {
        ((C754410TiZ) c786210Usl.l0).LIZLLL.LIZ(interfaceC420801kM);
    }

    public static final void onSubscribe$1(C786210Usl c786210Usl, InterfaceC420801kM interfaceC420801kM) {
        ((C780870Uk9) c786210Usl.l0).LJFF.LIZ(interfaceC420801kM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSuccess$0(C786210Usl c786210Usl, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.data.getClass();
        C754410TiZ c754410TiZ = (C754410TiZ) c786210Usl.l0;
        CoverImageModel coverImageModel = (CoverImageModel) baseResponse.data;
        if (!c754410TiZ.LIZ.isViewValid()) {
            c754410TiZ.LIZJ = null;
            return;
        }
        ImageModel imageModel = new ImageModel();
        imageModel.mUri = coverImageModel.uri;
        imageModel.setUrls(coverImageModel.urlList);
        c754410TiZ.LJ(imageModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSuccess$1(C786210Usl c786210Usl, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.data.getClass();
        C780870Uk9 c780870Uk9 = (C780870Uk9) c786210Usl.l0;
        CoverImageModel coverImageModel = (CoverImageModel) baseResponse.data;
        c780870Uk9.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_upload_cover_success");
        c474500IjALIZ.LJJIIZI(c780870Uk9.LIZIZ());
        c474500IjALIZ.LIZ();
        c780870Uk9.LIZLLL.LIZ();
        Context context = c780870Uk9.LIZJ;
        C766270U4b.LJIIIZ(context, context.getString(2131853500));
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C01QD.LIZ().LIZ().updateRoomInfo(c780870Uk9.LIZ, coverImageModel.uri).LJIILIIL(new C0UO0()).LIZIZ(new C786350Usz(c780870Uk9, 1));
    }

    public C786210Usl(C754410TiZ c754410TiZ, String str, int i) {
        this.$t = i;
        this.l0 = c754410TiZ;
    }

    public C786210Usl(C780870Uk9 c780870Uk9, String str, int i) {
        this.$t = i;
        this.l0 = c780870Uk9;
    }
}

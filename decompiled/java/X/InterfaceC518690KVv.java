package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisInteractiveDataRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisVerifyDataResponse;
import webcast.api.smb.SMBFormDetailResponse;

/* JADX INFO: renamed from: X.0KVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC518690KVv extends InterfaceC149400hg {
    C11NZ<C470590Icr<TetrisFormResponse>> LJJJJ(TetrisFormRequest tetrisFormRequest);

    C11NZ<C470590Icr<SMBFormDetailResponse.ResponseData>> LLLL(long j, String str);

    C11NZ<C470590Icr<TetrisVerifyDataResponse>> t(TetrisInteractiveDataRequest tetrisInteractiveDataRequest);
}

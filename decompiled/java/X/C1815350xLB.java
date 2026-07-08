package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import tikcast.api.anchor.DeleteBoardReq;
import tikcast.api.anchor.DeleteBoardResponse;

/* JADX INFO: renamed from: X.0xLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815350xLB implements InterfaceC1813970xIx {
    @Override // X.InterfaceC1813970xIx
    public final Object LJJZ(long j, InterfaceC1364105Vn<? super C470590Icr<DeleteBoardResponse.ResponseData>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
        DeleteBoardReq deleteBoardReq = new DeleteBoardReq();
        deleteBoardReq.boardId = j;
        return liveBoardApi.boardDelete(deleteBoardReq, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    @Override // X.InterfaceC1813970xIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLIIIL(X.C1814370xJb r13, boolean r14, X.InterfaceC1364105Vn<? super X.C470590Icr<tikcast.api.anchor.UpsertBoardResponse.ResponseData>> r15) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1815350xLB.LJLIIIL(X.0xJb, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // X.InterfaceC1813970xIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLLILLLL(int r11, int r12, X.InterfaceC1364105Vn<? super X.C470590Icr<tikcast.api.anchor.GetBoardListResponse.ResponseData>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C1815370xLD
            if (r0 == 0) goto L6e
            r9 = r13
            X.0xLD r9 = (X.C1815370xLD) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r5 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L4c
            if (r0 != r2) goto L7a
            X.C155000ia.LIZIZ(r5)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r5 = (com.bytedance.android.live.network.response.BaseResponse) r5
            T r0 = r5.data
            tikcast.api.anchor.GetBoardListResponse$ResponseData r0 = (tikcast.api.anchor.GetBoardListResponse.ResponseData) r0
            if (r0 == 0) goto L79
            java.util.List<com.bytedance.android.livesdk.model.Board> r4 = r0.boardList
            if (r4 == 0) goto L79
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            if (r2 < 0) goto L74
            com.bytedance.android.livesdk.model.Board r0 = (com.bytedance.android.livesdk.model.Board) r0
            com.bytedance.android.livesdk.model.Board r0 = X.C125700dr.LIZ(r0)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r4, r2, r0)
            r2 = r1
            goto L33
        L4c:
            X.C155000ia.LIZIZ(r5)
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi> r0 = com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi.class
            r1.getClass()
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi r4 = (com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi) r4
            int r0 = X.C1152620g6G.LIZJ()
            long r7 = (long) r0
            r9.LLILLL = r2
            r6 = r12
            r5 = r11
            java.lang.Object r5 = r4.boardList(r5, r6, r7, r9)
            if (r5 != r3) goto L22
            return r3
        L6e:
            X.0xLD r9 = new X.0xLD
            r9.<init>(r10, r13)
            goto L12
        L74:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L79:
            return r5
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1815350xLB.LJLLILLLL(int, int, X.05Vn):java.lang.Object");
    }
}

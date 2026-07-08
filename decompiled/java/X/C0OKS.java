package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0OKS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OKS extends InterfaceC149400hg {
    Object LJIILJJIL(int i, long j, long j2, long j3, Long l, int i2, String str, InterfaceC1364105Vn<? super C0OZ9> interfaceC1364105Vn);

    Object LJJIIJ(long j, long j2, InterfaceC1364105Vn<? super BulletinCreateItemResponse> interfaceC1364105Vn);

    Object LJJJJZI(long j, long j2, int i, Long l, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LJZL(long j, Long l, InterfaceC1364105Vn<? super BulletinFetchEventResponse> interfaceC1364105Vn);

    Object LLLIIIIL(Long l, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn);

    boolean LLLJIL(String str, String str2);

    Pair<String, Long> LLZILL(String str);

    Object a(long j, String str, InterfaceC1364105Vn<? super BulletinAccountMemberResponse> interfaceC1364105Vn);

    Object checkAwemeIsShared(String str, long j, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    Object pollVote(int i, long j, long j2, long j3, long j4, int i2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}

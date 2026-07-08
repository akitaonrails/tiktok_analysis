package X;

import android.os.Message;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904360zek implements INoticeCountService {
    public static final C1904360zek LLILLJJLI = new C1904360zek();
    public final /* synthetic */ INoticeCountService LL = (INoticeCountService) ServiceManager.get().getService(INoticeCountService.class);

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZ() {
        return this.LL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZJ(Message message) {
        this.LL.LIZJ(message);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZLLL(String str, List list) {
        this.LL.LIZLLL("boot_delay", list);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJ(int i, EnumC624380OeK enumC624380OeK, boolean z) {
        this.LL.LJ(i, enumC624380OeK, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJFF(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr) {
        this.LL.LJFF(enumC624380OeK, z, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJI(String str) {
        return this.LL.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJII() {
        this.LL.LJII();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final boolean LJIIIIZZ(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr) {
        return this.LL.LJIIIIZZ(enumC624380OeK, z, iArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIIZ(EntranceKey entranceKey, int i) {
        this.LL.LJIIIZ(entranceKey, i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIJ(int[] iArr, boolean z) {
        return this.LL.LJIIJ(iArr, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIJJI() {
        return this.LL.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIL(int i, boolean z) {
        return this.LL.LJIIL(40, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final NoticeGroupAttrs LJIILIIL(int i) {
        return this.LL.LJIILIIL(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILJJIL(int i, int i2) {
        this.LL.LJIILJJIL(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIILL() {
        return this.LL.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final Map<Integer, Integer> LJIILLIIL() {
        return this.LL.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIZILJ() {
        return this.LL.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJ(EntranceKey entranceKey) {
        return this.LL.LJIJ(entranceKey);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJI(int i, boolean z) {
        this.LL.LJIJI(i, z);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJJ(EntranceKey entranceKey) {
        this.LL.LJIJJ(entranceKey);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJJLI() {
        this.LL.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIL() {
        return this.LL.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJJ(int i) {
        return this.LL.LJJ(i);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final C11NZ LJJI(NoticeList noticeList) {
        return this.LL.LJJI(noticeList);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJJIFFI(EnumC624380OeK enumC624380OeK, int[] iArr) {
        this.LL.LJJIFFI(enumC624380OeK, iArr);
    }
}

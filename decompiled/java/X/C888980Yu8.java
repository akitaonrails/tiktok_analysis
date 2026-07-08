package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel;

/* JADX INFO: renamed from: X.0Yu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingPageViewModel", f = "ArchiveSettingPageViewModel.kt", l = {117, 133}, m = "onSettingItemClick$im_chatlist_impl_release")
public final class C888980Yu8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ArchiveSettingPageViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888980Yu8(ArchiveSettingPageViewModel archiveSettingPageViewModel, InterfaceC1364105Vn<? super C888980Yu8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = archiveSettingPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArchiveSettingPageViewModel@ee96.onSettingItemClick$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, this);
        C1C7U.LIZIZ("ArchiveSettingPageViewModel@ee96.onSettingItemClick$1");
        return objWQ2;
    }
}

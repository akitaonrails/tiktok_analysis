package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;

/* JADX INFO: renamed from: X.0LhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549790LhJ implements InterfaceC548750Lfd {
    public final CreativeModel LL;

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return "CreativeModelDataSource";
    }

    public C549790LhJ(CreativeModel creativeModel) {
        this.LL = creativeModel;
    }

    @Override // X.InterfaceC548750Lfd
    public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
        T t;
        if (!(interfaceC548900Lfs instanceof C1E4K) || (t = (T) this.LL.creativeInfo.getCreationId()) == null) {
            return null;
        }
        return t;
    }
}

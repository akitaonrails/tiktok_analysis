package X;

import com.lynx.tasm.service.IServiceProvider;

/* JADX INFO: renamed from: X.0jy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1301330jy7 extends IServiceProvider {
    void cancelPreloadMedia(String str, String str2);

    InterfaceC1301400jyE fetchResourceAsync(String str, C1530360pvW c1530360pvW, AbstractC1289780jfU abstractC1289780jfU);

    int isLocalResource(String str);

    boolean isReady();

    void preloadMedia(String str, String str2, String str3, long j, InterfaceC1301250jxz interfaceC1301250jxz);
}

package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.06Vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618606Vk<SPI> implements InterfaceC1731706qJ<Object, SPI> {
    public final Class<SPI> LL;
    public volatile SPI LLILLJJLI;

    public C1618606Vk(Class<SPI> cls) {
        this.LL = cls;
    }

    @Override // X.InterfaceC1731706qJ
    public final SPI getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        SPI spi = this.LLILLJJLI;
        if (spi == null) {
            spi = (SPI) PluggableExtentionKt.pluggableSpiForReal(this.LL);
            if (spi != null) {
                this.LLILLJJLI = spi;
            } else {
                return null;
            }
        }
        return spi;
    }
}

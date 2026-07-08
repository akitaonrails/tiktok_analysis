package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1088260eQS<T, M> extends AbstractC1088350eQb<T> {
    public final DataChannel LLILLL;
    public final Class<? extends NextLiveData<M>> LLILZ;
    public boolean LLILZIL;
    public AwS596S0100000_17 LLILZLL;

    public abstract T LJII(M m);

    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public void LJ() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 407);
        this.LLILZLL = awS596S0100000_17;
        DataChannel dataChannel = this.LLILLL;
        dataChannel.EQ2(dataChannel.LLILZ, this.LLILZ, awS596S0100000_17);
    }

    @Override // X.AbstractC1088350eQb, X.AbstractC1089300eS8
    public void release() {
        AwS596S0100000_17 awS596S0100000_17 = this.LLILZLL;
        if (awS596S0100000_17 != null) {
            DataChannel dataChannel = this.LLILLL;
            dataChannel.GQ2(dataChannel.LLILZ, this.LLILZ, awS596S0100000_17);
        }
        this.LLILZIL = false;
    }

    public AbstractC1088260eQS(DataChannel dataChannel, AbstractC1084540eKS<T> abstractC1084540eKS, Class<? extends NextLiveData<M>> cls) {
        super(abstractC1084540eKS);
        this.LLILLL = dataChannel;
        this.LLILZ = cls;
    }
}

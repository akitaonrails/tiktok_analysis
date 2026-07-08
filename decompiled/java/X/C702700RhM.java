package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702700RhM extends C09AY implements Function2<EnumC702720RhO, Boolean, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C699090RbX<? extends ComponentPriorityProtocol> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702700RhM(boolean z, String str, C699090RbX<? extends ComponentPriorityProtocol> c699090RbX, String str2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = c699090RbX;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC702720RhO enumC702720RhO, Boolean bool) {
        final EnumC702720RhO enumC702720RhO2 = enumC702720RhO;
        if (bool.booleanValue()) {
            new C702780RhU(this.LLILZ, this.LLILLJJLI);
            C0T6L.LIZLLL();
        } else {
            new C702760RhS(this.LLILZ, this.LLILLJJLI, enumC702720RhO2);
            C0T6L.LIZLLL();
            if (this.LL) {
                ExecutorService executorServiceLJFF = C20684815ws.LJFF();
                final String str = this.LLILLJJLI;
                final C699090RbX<? extends ComponentPriorityProtocol> c699090RbX = this.LLILLL;
                executorServiceLJFF.submit(new Runnable() { // from class: X.0RhL
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FcpNodeExposureDetector@7512.startDeferCheckExposureJob$1$2$1$3");
                        try {
                            C700410Rdf c700410Rdf = C700410Rdf.LIZ;
                            String str2 = str;
                            C699090RbX<? extends ComponentPriorityProtocol> c699090RbX2 = c699090RbX;
                            EnumC702720RhO enumC702720RhO3 = enumC702720RhO2;
                            c700410Rdf.getClass();
                            C700410Rdf.LJFF(str2, c699090RbX2, enumC702720RhO3);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FcpNodeExposureDetector@7512.startDeferCheckExposureJob$1$2$1$3");
                    }
                });
            } else {
                C700410Rdf c700410Rdf = C700410Rdf.LIZ;
                String str2 = this.LLILLJJLI;
                C699090RbX<? extends ComponentPriorityProtocol> c699090RbX2 = this.LLILLL;
                c700410Rdf.getClass();
                C700410Rdf.LJFF(str2, c699090RbX2, enumC702720RhO2);
            }
        }
        return Unit.LIZ;
    }
}

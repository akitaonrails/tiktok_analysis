package X;

import com.bytedance.aigc.proto.Level;
import com.ss.android.ugc.aweme.trace.api.TraceLogProvider;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Vk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC806270Vk1 implements TraceLogProvider {
    public abstract C547290LdH LIZJ();

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final boolean LIZ() {
        return LIZJ().LIZJ.invoke().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final C806210Vjv LIZIZ() {
        C547290LdH c547290LdHLIZJ = LIZJ();
        final AwS557S0100000_13 awS557S0100000_13 = new AwS557S0100000_13(c547290LdHLIZJ, 160);
        final AwS557S0100000_13 awS557S0100000_132 = new AwS557S0100000_13(c547290LdHLIZJ, 161);
        final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c547290LdHLIZJ, 962);
        final AwS557S0100000_13 awS557S0100000_133 = new AwS557S0100000_13(c547290LdHLIZJ, 162);
        final AwS557S0100000_13 awS557S0100000_134 = new AwS557S0100000_13(c547290LdHLIZJ, 163);
        return new C806210Vjv(C1697810uHb.LJIIJJI(new C806190Vjt(new InterfaceC806180Vjs(awS557S0100000_13) { // from class: X.0Vk5
            public final Function0<C547270LdF> LIZ;

            {
                this.LIZ = awS557S0100000_13;
            }

            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return this.LIZ.invoke().LIZIZ;
            }
        }), new C806200Vju(C1697810uHb.LJIIJJI(new C806190Vjt(new InterfaceC806180Vjs(awS557S0100000_132) { // from class: X.0Vk4
            public final Function0<C547270LdF> LIZ;

            {
                this.LIZ = awS557S0100000_132;
            }

            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return this.LIZ.invoke().LIZ;
            }
        }), new C806190Vjt(new InterfaceC806180Vjs(awS552S0100000_8) { // from class: X.0LdE
            public final Function0<C547270LdF> LIZ;

            {
                this.LIZ = awS552S0100000_8;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                Level level;
                C547270LdF c547270LdFInvoke = this.LIZ.invoke();
                String str = c806050Vjf.LJII;
                c547270LdFInvoke.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                switch (upperCase.hashCode()) {
                    case 2251950:
                        if (upperCase.equals("INFO")) {
                            level = Level.INFO;
                            if (level == null) {
                            }
                        }
                        level = Level.DEBUG;
                        break;
                    case 2656902:
                        if (upperCase.equals("WARN")) {
                            level = Level.WARN;
                            if (level == null) {
                            }
                        }
                        level = Level.DEBUG;
                        break;
                    case 64921139:
                        if (upperCase.equals("DEBUG")) {
                            level = Level.DEBUG;
                            if (level == null) {
                            }
                        }
                        level = Level.DEBUG;
                        break;
                    case 66247144:
                        if (upperCase.equals("ERROR")) {
                            level = Level.ERROR;
                            if (level == null) {
                            }
                        }
                        level = Level.DEBUG;
                        break;
                    default:
                        level = Level.DEBUG;
                        break;
                }
                if (level.getValue() >= this.LIZ.invoke().LIZJ) {
                    return true;
                }
                return false;
            }
        }), new C806190Vjt(new InterfaceC806180Vjs(awS557S0100000_133) { // from class: X.0Vk2
            public final Function0<C547270LdF> LIZ;

            {
                this.LIZ = awS557S0100000_133;
            }

            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return !this.LIZ.invoke().LJ.contains(c806050Vjf.LJ);
            }
        }), new C806190Vjt(new InterfaceC806180Vjs(awS557S0100000_134) { // from class: X.0Vk3
            public final Function0<C547270LdF> LIZ;

            {
                this.LIZ = awS557S0100000_134;
            }

            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return !this.LIZ.invoke().LIZLLL.contains(c806050Vjf.LJ);
            }
        })))));
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final String getBusinessId() {
        return LIZJ().LIZ;
    }
}

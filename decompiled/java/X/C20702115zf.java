package X;

import X.C0SXF;
import X.C224000ti;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import android.content.Context;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$captionCommonPhoneStatusParamsProvider$2$1;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20702115zf extends C09AY implements Function0<CLACaptionAssemV2$captionCommonPhoneStatusParamsProvider$2$1> {
    public final /* synthetic */ CLACaptionAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20702115zf(CLACaptionAssemV2 cLACaptionAssemV2) {
        super(0);
        this.LL = cLACaptionAssemV2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$captionCommonPhoneStatusParamsProvider$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final CLACaptionAssemV2$captionCommonPhoneStatusParamsProvider$2$1 invoke() {
        final CLACaptionAssemV2 cLACaptionAssemV2 = this.LL;
        return new ETParamsProvider<C224000ti>() { // from class: com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$captionCommonPhoneStatusParamsProvider$2$1
            /* JADX WARN: Type inference failed for: r5v0, types: [X.00ti] */
            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final C224000ti Mb0() {
                double dLF1 = cLACaptionAssemV2.Bp().LF1();
                Context context = cLACaptionAssemV2.getContext();
                int i = 0;
                if (context != null && C0SXF.LJIL(context)) {
                    i = 1;
                }
                return new InterfaceC0241006d(dLF1, i) { // from class: X.00ti
                    public final double LL;
                    public final int LLILLJJLI;

                    @Override // X.InterfaceC1282004zy
                    public final boolean checkExtraParamKey() {
                        return false;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C224000ti)) {
                            return false;
                        }
                        C224000ti c224000ti = (C224000ti) obj;
                        return Double.compare(this.LL, c224000ti.LL) == 0 && this.LLILLJJLI == c224000ti.LLILLJJLI;
                    }

                    public final int hashCode() {
                        return (C786410Ut5.X2(this.LL) * 31) + this.LLILLJJLI;
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> keyParams() {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("launch_volume_pct", Double.valueOf(this.LL));
                        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLILLJJLI));
                        return linkedHashMap;
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CaptionCommonPhoneStatusParams(launchVolume=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", isLandscapeScreen=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> filteredParams() {
                        return keyParams();
                    }

                    @Override // X.InterfaceC1282004zy
                    public final Map<String, Object> getExtraParam() {
                        return C2097608Jq.LJ();
                    }

                    {
                        this.LL = dLF1;
                        this.LLILLJJLI = i;
                    }
                };
            }

            @Override // com.ss.android.tracker.event.EventParamsProtocol
            public final InterfaceC1282004zy getParam() {
                if (lt2(C224000ti.class)) {
                    return Mb0();
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
            public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
                return Intrinsics.LJFF(cls, C224000ti.class);
            }
        };
    }
}

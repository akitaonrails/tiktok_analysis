package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;

/* JADX INFO: renamed from: X.1DI6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DI6 {
    public static final C1DI6 LIZ = new C1DI6();
    public static InterfaceC1641620soy LIZIZ;

    public static final Cert LIZJ(C1DIA c1dia, InterfaceC1641630soz interfaceC1641630soz) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CertService: getDefaultCert: point: ");
        sbLIZ.append(c1dia);
        sbLIZ.append(" scene: ");
        sbLIZ.append(interfaceC1641630soz);
        sbLIZ.append(' ');
        sbLIZ.append(new Throwable());
        interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
        return CertProviderManagerKt.findCert("", 0);
    }

    public final Cert LIZ(C1DI8 c1di8, InterfaceC1641620soy interfaceC1641620soy) {
        if (interfaceC1641620soy == null) {
            interfaceC1641620soy = LIZIZ;
        }
        if (interfaceC1641620soy == null) {
            return LIZJ(c1di8, null);
        }
        if (interfaceC1641620soy == EnumC2249681D3m.SHOOT) {
            if (c1di8 == C1DI7.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE) {
                return CertProviderManagerKt.findCert("bpea-1692", 1476788229);
            }
            if (c1di8 == C1DI7.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE) {
                return CertProviderManagerKt.findCert("bpea-1693", 1476788229);
            }
            if (c1di8 == C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_START) {
                return CertProviderManagerKt.findCert("bpea-1695", 1476788229);
            }
            if (c1di8 == C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                return CertProviderManagerKt.findCert("bpea-1696", 1476788229);
            }
            if (c1di8 == C1DI7.FTC_OPEN_CAMERA_ENTER_PAGE) {
                return CertProviderManagerKt.findCert("bpea-1699", 1476788229);
            }
            if (c1di8 == C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW) {
                return CertProviderManagerKt.findCert("bpea-1726", 1476788229);
            }
            if (c1di8 == C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP) {
                return CertProviderManagerKt.findCert("bpea-1747", 1476788229);
            }
            if (c1di8 == C1DI7.SWITCH_CAMERA_TOOL_BAR) {
                return CertProviderManagerKt.findCert("bpea-1748", 1476788229);
            }
            if (c1di8 == C1DI7.AUDIO_START_RECORD_DEFAULT_WITH_AUDIO) {
                return CertProviderManagerKt.findCert("bpea-1816", 1476788229);
            }
            if (c1di8 == C1DI7.AUDIO_START_RECORD_DEFAULT_NOT_AUDIO) {
                return CertProviderManagerKt.findCert("bpea-1817", 1476788229);
            }
            if (c1di8 == C1DI7.AUDIO_START_RECORD_USE_EFFECT) {
                return CertProviderManagerKt.findCert("bpea-1820", 1476788229);
            }
            return LIZJ(c1di8, null);
        }
        if (interfaceC1641620soy == EnumC2249681D3m.TTEP_PREVIEW) {
            if (c1di8 == C1DI7.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE) {
                return CertProviderManagerKt.findCert("bpea-131", 1476788230);
            }
            if (c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_START && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                if (c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW && c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP && c1di8 != C1DI7.SWITCH_CAMERA_TOOL_BAR) {
                    if (c1di8 == C1DI7.AUDIO_START_RECORD_USE_EFFECT) {
                        return CertProviderManagerKt.findCert("bpea-ttep_preview_audio_record_by_prop", 1476788230);
                    }
                    return LIZJ(c1di8, null);
                }
                return CertProviderManagerKt.findCert("bpea-ttep_preview_shoot_switch_camera_front_rear", 1476788230);
            }
            return CertProviderManagerKt.findCert("bpea-ttep_preview_enter_shoot", 1476788230);
        }
        if (interfaceC1641620soy == EnumC2249681D3m.DUET) {
            if (c1di8 == C1DI7.AUDIO_START_DUET) {
                return CertProviderManagerKt.findCert("bpea-1828", 1476788236);
            }
            if (c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_START && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                if (c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW && c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP && c1di8 != C1DI7.SWITCH_CAMERA_TOOL_BAR) {
                    if (c1di8 == C1DI7.AUDIO_START_RECORD_USE_EFFECT) {
                        return CertProviderManagerKt.findCert("bpea-duet_shoot_start_record", 1476788236);
                    }
                    return LIZJ(c1di8, null);
                }
                return CertProviderManagerKt.findCert("bpea-duet_shoot_switch_camera_front_rear", 1476788236);
            }
            return CertProviderManagerKt.findCert("bpea-duet_enter_shoot", 1476788236);
        }
        if (interfaceC1641620soy == EnumC2249681D3m.STITCH) {
            if (c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_SURFACE_CREATE && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_START && c1di8 != C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_RESUME) {
                if (c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_VIEW && c1di8 != C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP && c1di8 != C1DI7.SWITCH_CAMERA_TOOL_BAR) {
                    if (c1di8 == C1DI7.AUDIO_START_RECORD_USE_EFFECT) {
                        return CertProviderManagerKt.findCert("bpea-stitch_shoot_start_record", 1476788237);
                    }
                    return LIZJ(c1di8, null);
                }
                return CertProviderManagerKt.findCert("bpea-stitch_shoot_switch_camera_front_rear", 1476788237);
            }
            return CertProviderManagerKt.findCert("bpea-stitch_enter_shoot", 1476788237);
        }
        return LIZJ(c1di8, interfaceC1641620soy);
    }

    public final Cert LIZIZ(C1DI9 c1di9, EnumC1641610sox enumC1641610sox) {
        if (enumC1641610sox == EnumC1641610sox.USER_OPERATION) {
            if (c1di9 == C1DI5.STOP_AUDIO_USING_SOUND_EFFECT) {
                return CertProviderManagerKt.findCert("bpea-1794", 1476788483);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_CANCEL_SOUND_EFFECT) {
                return CertProviderManagerKt.findCert("bpea-1795", 1476788483);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_CAPTURE_WITH_DISABLE) {
                return CertProviderManagerKt.findCert("bpea-1808", 1476788483);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_CAPTURE_WITH_ENABLE) {
                return CertProviderManagerKt.findCert("bpea-1823", 1476788483);
            }
            return LIZJ(c1di9, null);
        }
        if (enumC1641610sox == EnumC1641610sox.PAGE_INVISIBLE) {
            if (c1di9 == C1DI5.CLOSE_CAMERA_CONTROLLER_ON_DESTROY) {
                return CertProviderManagerKt.findCert("bpea-1757", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_COMPONENT_ON_DESTROY) {
                return CertProviderManagerKt.findCert("bpea-1758", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_SURFACE_DESTROY) {
                return CertProviderManagerKt.findCert("bpea-1762", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_VIEW_ON_STOP) {
                return CertProviderManagerKt.findCert("bpea-1763", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_COMPONENT_ON_STOP) {
                return CertProviderManagerKt.findCert("bpea-1764", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_ADD_STREAM) {
                return CertProviderManagerKt.findCert("bpea-1768", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_ON_PAUSE) {
                return CertProviderManagerKt.findCert("bpea-1769", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_ON_STOP_CAMERA_LOGIC) {
                return CertProviderManagerKt.findCert("bpea-1770", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_ON_SURFACE_DESTROY) {
                return CertProviderManagerKt.findCert("bpea-1765", 1476788484);
            }
            if (c1di9 == C1DI5.CLOSE_CAMERA_ON_TEXTURE_DESTROY) {
                return CertProviderManagerKt.findCert("bpea-1766", 1476788484);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_ON_PAUSE) {
                return CertProviderManagerKt.findCert("bpea-1792", 1476788484);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_SOUND_EFFECT_STOP) {
                return CertProviderManagerKt.findCert("bpea-1796", 1476788484);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_CAMERA_LOGIC_PAUSE) {
                return CertProviderManagerKt.findCert("bpea-1814", 1476788484);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_CAMERA_CLOSE) {
                return CertProviderManagerKt.findCert("bpea-1824", 1476788484);
            }
            if (c1di9 == C1DI5.STOP_AUDIO_RELEASE_CAMERA_CLOSE) {
                return CertProviderManagerKt.findCert("bpea-1825", 1476788484);
            }
            return LIZJ(c1di9, null);
        }
        return LIZJ(c1di9, enumC1641610sox);
    }
}

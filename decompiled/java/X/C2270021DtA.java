package X;

/* JADX INFO: renamed from: X.1DtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2270021DtA extends AbstractC2270071DtF implements InterfaceC886280Ypm {
    @Override // X.InterfaceC886280Ypm
    public final int LJII(String str) {
        Long l = (Long) AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_group_chat_count_last_login", str)).LJFF();
        if (l != null) {
            return (int) l.longValue();
        }
        return -1;
    }

    @Override // X.InterfaceC886280Ypm
    public final int LJIILJJIL(String str) {
        Long l = (Long) AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_message_request_entrance_count_last_login", str)).LJFF();
        if (l != null) {
            return (int) l.longValue();
        }
        return -1;
    }

    @Override // X.InterfaceC886280Ypm
    public final int LJIJJ(String str) {
        Long l = (Long) AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_single_chat_count_last_login", str)).LJFF();
        if (l != null) {
            return (int) l.longValue();
        }
        return -1;
    }

    @Override // X.InterfaceC886280Ypm
    public final void LJI(int i, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_group_chat_count_last_login", str)).LIZ(Long.valueOf(i));
    }

    @Override // X.InterfaceC886280Ypm
    public final void LJIILIIL(int i, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_message_request_entrance_count_last_login", str)).LIZ(Long.valueOf(i));
    }

    @Override // X.InterfaceC886280Ypm
    public final void LJIIZILJ(int i, String str) {
        AbstractC2270071DtF.LJJIFFI().LIZ(C1555980qaq.LIZ("dm_single_chat_count_last_login", str)).LIZ(Long.valueOf(i));
    }
}

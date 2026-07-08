package X;

/* JADX INFO: renamed from: X.0YC9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YC9 {
    public volatile long LIZ;
    public volatile long LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile long LJ;
    public volatile long LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public volatile long LJIIJJI;
    public volatile long LJIIL;
    public volatile long LJIILIIL;
    public volatile long LJIILJJIL;
    public volatile long LJIILL;
    public volatile long LJIILLIIL;
    public volatile long LJIIZILJ;
    public volatile long LJIJ;
    public volatile long LJIJI;
    public volatile long LJIJJ;
    public volatile long LJIJJLI;
    public volatile long LJIL;
    public volatile int LJJI;
    public String LJJII;
    public boolean LJJIIZ;
    public long LJJIIZI;
    public C0Y3I LJJIJIIJIL;
    public volatile boolean LJJ = true;
    public long LJJIFFI = -1;
    public int LJJIII = -1;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = -1;
    public String LJJIJ = "";
    public volatile int LJJIJIIJI = -1;

    public final C0YCH LIZ() {
        if (this.LJJIIJZLJL == -1028 && this.LJJIIJ == -1 && this.LJIIIIZZ > 0) {
            return C0YCH.CLIENT_CANCEL;
        }
        int i = this.LJJIIJZLJL;
        int i2 = C0YIF.LIZ;
        if (i != i2) {
            return C0YCH.CLIENT_ERROR;
        }
        int i3 = this.LJJIIJ;
        return (i3 == i2 || i3 == 200) ? this.LJJIII != C0YCN.SEND_SUCCEED.getValue() ? C0YCH.CHECK_CODE_ERROR : C0YCH.SUCCESS : C0YCH.SERVER_ERROR;
    }

    public final void LIZIZ() {
        C0Y3I c0y3i = this.LJJIJIIJIL;
        if (c0y3i != null) {
            c0y3i.getClass();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMsgMetrics:{sdk_start_time=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bs_save_switch_thread_cost_time=");
        sbLIZ.append(0L);
        sbLIZ.append(", bs_db_operation_finish_time");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", bs_save_switch_thread_cost_time_2=");
        sbLIZ.append(0L);
        sbLIZ.append(", bs_save_cost_time=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", bs_notify_conversation_cost_time=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bs_notify_msg_sending_start_time=");
        sbLIZ.append(0L);
        sbLIZ.append(", bs_has_fetch_conversation_info=");
        sbLIZ.append(false);
        sbLIZ.append(", bs_fetch_conversation_info_cost_time=");
        sbLIZ.append(0L);
        sbLIZ.append(", bs_cost_time=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", handler_send_request_start_time=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", handler_response_start_time=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", handler_send_request_start_ntp_time=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", handler_response_start_ntp_time=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", handler_send_request_cost_time=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", server_request_arrived_time=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", server_execution_end_time=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", send_request_uplink_cost_time=");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append(", send_request_downlink_cost_time=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", send_request_arrived_cost_time=");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append(", afs_switch_thread_cost_time=");
        sbLIZ.append(0L);
        sbLIZ.append(", afs_update_msg_cost_time=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", afs_notify_conversation_cost_time=");
        sbLIZ.append(0L);
        sbLIZ.append(", afs_cost_time=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", sdk_end_time=");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(", sdk_cost_time=");
        sbLIZ.append(this.LJIL);
        sbLIZ.append(", push_before_response=");
        sbLIZ.append(false);
        sbLIZ.append(", from_push=");
        sbLIZ.append(false);
        sbLIZ.append(", is_ws=");
        sbLIZ.append(this.LJJ);
        sbLIZ.append(", result_code=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", check_code=");
        sbLIZ.append(this.LJJIFFI);
        sbLIZ.append(", server_status_code=");
        sbLIZ.append(this.LJJIIJ);
        sbLIZ.append(", client_status_code=");
        sbLIZ.append(this.LJJIIJZLJL);
        sbLIZ.append(", send_message_status_code=");
        sbLIZ.append(this.LJJIII);
        sbLIZ.append(", check_message=");
        sbLIZ.append(this.LJJII);
        sbLIZ.append(", filter_reason=");
        sbLIZ.append(this.LJJI);
        sbLIZ.append(", received_error_ack=");
        sbLIZ.append(this.LJJIIZ);
        sbLIZ.append(", network_retry_count= ");
        sbLIZ.append(this.LJJIJIIJI);
        sbLIZ.append(", log_id=");
        sbLIZ.append(this.LJJIJ);
        sbLIZ.append(", msg_created_at=");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

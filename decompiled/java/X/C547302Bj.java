package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547302Bj extends Message<C547302Bj, C568002Ji> {
    public static final ProtoAdapter<C547302Bj> ADAPTER = new ProtoAdapter<C547302Bj>() { // from class: X.024V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547302Bj decode(ProtoReader protoReader) {
            C547302Bj c547302Bj = new C547302Bj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c547302Bj.platform = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c547302Bj.song_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c547302Bj.platform_selected_by_user = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c547302Bj.token = C654402gw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c547302Bj.button_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c547302Bj.always_show_in_fyp_switch = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c547302Bj.show_mdp_tt_to_dsp_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547302Bj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547302Bj c547302Bj) {
            C547302Bj c547302Bj2 = c547302Bj;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c547302Bj2.platform) + ProtoAdapter.STRING.encodedSizeWithTag(2, c547302Bj2.song_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c547302Bj2.platform_selected_by_user) + C654402gw.ADAPTER.encodedSizeWithTag(4, c547302Bj2.token) + protoAdapter.encodedSizeWithTag(5, c547302Bj2.button_type) + protoAdapter2.encodedSizeWithTag(6, c547302Bj2.always_show_in_fyp_switch) + protoAdapter.encodedSizeWithTag(7, c547302Bj2.show_mdp_tt_to_dsp_status) + c547302Bj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C547302Bj c547302Bj) {
            C547302Bj c547302Bj2 = c547302Bj;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c547302Bj2.platform);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c547302Bj2.song_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c547302Bj2.platform_selected_by_user);
            C654402gw.ADAPTER.encodeWithTag(protoWriter, 4, c547302Bj2.token);
            protoAdapter.encodeWithTag(protoWriter, 5, c547302Bj2.button_type);
            protoAdapter2.encodeWithTag(protoWriter, 6, c547302Bj2.always_show_in_fyp_switch);
            protoAdapter.encodeWithTag(protoWriter, 7, c547302Bj2.show_mdp_tt_to_dsp_status);
            protoWriter.writeBytes(c547302Bj2.unknownFields());
        }
    };
    public Boolean always_show_in_fyp_switch;
    public Integer button_type;
    public Integer platform;
    public Boolean platform_selected_by_user;
    public Integer show_mdp_tt_to_dsp_status;
    public String song_id;
    public C654402gw token;

    public C547302Bj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568002Ji newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C5 extends Message<C02C5, C02LO> {
    public static final ProtoAdapter<C02C5> ADAPTER = new ProtoAdapter<C02C5>() { // from class: X.02Bd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C5 decode(ProtoReader protoReader) {
            C02C5 c02c5 = new C02C5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02c5.is_ep_multi_music = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02c5.fused_music_infos.add(C546602Bc.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02c5.is_smart_extended = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C5 c02c5) {
            C02C5 c02c52 = c02c5;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c02c52.is_smart_extended) + C546602Bc.ADAPTER.asRepeated().encodedSizeWithTag(2, c02c52.fused_music_infos) + protoAdapter.encodedSizeWithTag(3, c02c52.is_ep_multi_music) + c02c52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C5 c02c5) {
            C02C5 c02c52 = c02c5;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02c52.is_smart_extended);
            C546602Bc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02c52.fused_music_infos);
            protoAdapter.encodeWithTag(protoWriter, 3, c02c52.is_ep_multi_music);
            protoWriter.writeBytes(c02c52.unknownFields());
        }
    };
    public List<C546602Bc> fused_music_infos;
    public Boolean is_ep_multi_music;
    public Boolean is_smart_extended;

    public C02C5() {
        super(ADAPTER, ByteString.EMPTY);
        this.fused_music_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

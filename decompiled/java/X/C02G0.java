package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G0 extends Message<C02G0, C573902Lp> {
    public static final ProtoAdapter<C02G0> ADAPTER = new ProtoAdapter<C02G0>() { // from class: X.028h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G0 decode(ProtoReader protoReader) {
            C02G0 c02g0 = new C02G0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g0.full_synced = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02g0.nickname = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g0.platform_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G0 c02g0) {
            C02G0 c02g02 = c02g0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02g02.platform_name) + protoAdapter.encodedSizeWithTag(2, c02g02.nickname) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02g02.full_synced) + c02g02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02G0 c02g0) {
            C02G0 c02g02 = c02g0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02g02.platform_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c02g02.nickname);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c02g02.full_synced);
            protoWriter.writeBytes(c02g02.unknownFields());
        }
    };
    public Boolean full_synced;
    public String nickname;
    public String platform_name;

    public C02G0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573902Lp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

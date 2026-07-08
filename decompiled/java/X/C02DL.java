package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DL extends Message<C02DL, C02LQ> {
    public static final ProtoAdapter<C02DL> ADAPTER = new ProtoAdapter<C02DL>() { // from class: X.02DJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DL decode(ProtoReader protoReader) {
            C02DL c02dl = new C02DL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02dl.releasable = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c02dl.auto_display = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c02dl.timing_keys.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c02dl.code = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DL c02dl) {
            C02DL c02dl2 = c02dl;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02dl2.code) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, c02dl2.timing_keys);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c02dl2.auto_display) + protoAdapter.encodedSizeWithTag(4, c02dl2.releasable) + c02dl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DL c02dl) {
            C02DL c02dl2 = c02dl;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02dl2.code);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, c02dl2.timing_keys);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c02dl2.auto_display);
            protoAdapter.encodeWithTag(protoWriter, 4, c02dl2.releasable);
            protoWriter.writeBytes(c02dl2.unknownFields());
        }
    };
    public Boolean auto_display;
    public Integer code;
    public Boolean releasable;
    public List<String> timing_keys;

    public C02DL() {
        super(ADAPTER, ByteString.EMPTY);
        this.timing_keys = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

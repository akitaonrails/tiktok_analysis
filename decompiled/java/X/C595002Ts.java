package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C595002Ts extends Message<C595002Ts, C595102Tt> {
    public static final ProtoAdapter<C595002Ts> ADAPTER = new ProtoAdapter<C595002Ts>() { // from class: X.02Tr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C595002Ts decode(ProtoReader protoReader) {
            C595002Ts c595002Ts = new C595002Ts();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c595002Ts.enable_cache = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c595002Ts.activity_ids.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c595002Ts.surprise_item_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c595002Ts;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C595002Ts c595002Ts) {
            C595002Ts c595002Ts2 = c595002Ts;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c595002Ts2.surprise_item_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, c595002Ts2.activity_ids) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c595002Ts2.enable_cache) + c595002Ts2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C595002Ts c595002Ts) {
            C595002Ts c595002Ts2 = c595002Ts;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c595002Ts2.surprise_item_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, c595002Ts2.activity_ids);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c595002Ts2.enable_cache);
            protoWriter.writeBytes(c595002Ts2.unknownFields());
        }
    };
    public List<Long> activity_ids;
    public Boolean enable_cache;
    public Integer surprise_item_type;

    public C595002Ts() {
        super(ADAPTER, ByteString.EMPTY);
        this.activity_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C595102Tt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

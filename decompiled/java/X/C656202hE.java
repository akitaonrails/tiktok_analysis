package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C656202hE extends Message<C656202hE, C656302hF> {
    public static final ProtoAdapter<C656202hE> ADAPTER = new ProtoAdapter<C656202hE>() { // from class: X.02hD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C656202hE decode(ProtoReader protoReader) {
            C656202hE c656202hE = new C656202hE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c656202hE.data = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c656202hE.sticker_pendant = C2251271D9p.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c656202hE.item_like_egg = C655902hB.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c656202hE.priority = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c656202hE.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c656202hE;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C656202hE c656202hE) {
            C656202hE c656202hE2 = c656202hE;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c656202hE2.type) + protoAdapter.encodedSizeWithTag(2, c656202hE2.priority) + C655902hB.ADAPTER.encodedSizeWithTag(3, c656202hE2.item_like_egg) + C2251271D9p.ADAPTER.encodedSizeWithTag(4, c656202hE2.sticker_pendant) + ProtoAdapter.STRING.encodedSizeWithTag(5, c656202hE2.data) + c656202hE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C656202hE c656202hE) {
            C656202hE c656202hE2 = c656202hE;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c656202hE2.type);
            protoAdapter.encodeWithTag(protoWriter, 2, c656202hE2.priority);
            C655902hB.ADAPTER.encodeWithTag(protoWriter, 3, c656202hE2.item_like_egg);
            C2251271D9p.ADAPTER.encodeWithTag(protoWriter, 4, c656202hE2.sticker_pendant);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c656202hE2.data);
            protoWriter.writeBytes(c656202hE2.unknownFields());
        }
    };
    public String data;
    public C655902hB item_like_egg;
    public Integer priority;
    public C2251271D9p sticker_pendant;
    public Integer type;

    public C656202hE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C656302hF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}

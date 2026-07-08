package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C589402Ro extends Message<C589402Ro, C589502Rp> {
    public static final ProtoAdapter<C589402Ro> ADAPTER = new ProtoAdapter<C589402Ro>() { // from class: X.02Rn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C589402Ro decode(ProtoReader protoReader) {
            C589402Ro c589402Ro = new C589402Ro();
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
                                    c589402Ro.leading = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c589402Ro.bottom = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c589402Ro.trailing = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c589402Ro.top = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c589402Ro;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C589402Ro c589402Ro) {
            C589402Ro c589402Ro2 = c589402Ro;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c589402Ro2.top) + protoAdapter.encodedSizeWithTag(2, c589402Ro2.trailing) + protoAdapter.encodedSizeWithTag(3, c589402Ro2.bottom) + protoAdapter.encodedSizeWithTag(4, c589402Ro2.leading) + c589402Ro2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C589402Ro c589402Ro) {
            C589402Ro c589402Ro2 = c589402Ro;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c589402Ro2.top);
            protoAdapter.encodeWithTag(protoWriter, 2, c589402Ro2.trailing);
            protoAdapter.encodeWithTag(protoWriter, 3, c589402Ro2.bottom);
            protoAdapter.encodeWithTag(protoWriter, 4, c589402Ro2.leading);
            protoWriter.writeBytes(c589402Ro2.unknownFields());
        }
    };
    public Integer bottom;
    public Integer leading;
    public Integer top;
    public Integer trailing;

    public C589402Ro() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C589502Rp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
